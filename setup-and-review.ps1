# Setup and Review Script for test-java-project
Write-Host "🚀 Setting up test-java-project for Droog AI Review" -ForegroundColor Cyan
Write-Host ""

$repo = "abhijeet1771/AI-reviewer"
$branch = "test-droog-ai-integration"

# Step 1: Commit changes
Write-Host "1️⃣ Committing changes..." -ForegroundColor Yellow
git add .
git commit -m "Update files for Droog AI testing" -m "- Updated line endings
- Ready for AI review"
if ($LASTEXITCODE -eq 0) {
    Write-Host "   ✓ Changes committed" -ForegroundColor Green
} else {
    Write-Host "   ⚠️  No changes to commit or commit failed" -ForegroundColor Yellow
}

# Step 2: Push to GitHub
Write-Host "`n2️⃣ Pushing to GitHub..." -ForegroundColor Yellow
git push origin $branch
if ($LASTEXITCODE -eq 0) {
    Write-Host "   ✓ Pushed successfully!" -ForegroundColor Green
} else {
    Write-Host "   ✗ Push failed" -ForegroundColor Red
    exit 1
}

# Step 3: Check for existing PR
Write-Host "`n3️⃣ Checking for existing PR..." -ForegroundColor Yellow
Write-Host "   Repository: $repo" -ForegroundColor White
Write-Host "   Branch: $branch" -ForegroundColor White
Write-Host ""
Write-Host "   Please check: https://github.com/$repo/pulls" -ForegroundColor Cyan
Write-Host "   Or create PR: https://github.com/$repo/compare/main...$branch" -ForegroundColor Cyan

# Step 4: Instructions for review
Write-Host "`n4️⃣ To run Droog AI review:" -ForegroundColor Yellow
Write-Host ""
Write-Host "   cd 'D:\DROOG AI'" -ForegroundColor White
Write-Host "   npx tsx src/index.ts review --repo $repo --pr [PR_NUMBER] --enterprise --post" -ForegroundColor White
Write-Host ""
Write-Host "   Replace [PR_NUMBER] with actual PR number" -ForegroundColor Gray

Write-Host "`n✅ Setup complete!" -ForegroundColor Green

