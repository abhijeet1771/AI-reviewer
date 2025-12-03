# PowerShell Script to Create PR

Write-Host "=== Creating Feature Branch and PR ===" -ForegroundColor Cyan

# Step 1: Check current branch
Write-Host "`n1. Checking current branch..." -ForegroundColor Yellow
git branch

# Step 2: Create feature branch
Write-Host "`n2. Creating feature branch..." -ForegroundColor Yellow
git checkout -b add-buggy-features
if ($LASTEXITCODE -eq 0) {
    Write-Host "   ✓ Branch created" -ForegroundColor Green
} else {
    Write-Host "   Branch might already exist, switching..." -ForegroundColor Yellow
    git checkout add-buggy-features
}

# Step 3: Check changes
Write-Host "`n3. Checking changes..." -ForegroundColor Yellow
git status

# Step 4: Add and commit
Write-Host "`n4. Committing changes..." -ForegroundColor Yellow
git add .
git commit -m "Add buggy features for AI review testing"
Write-Host "   ✓ Changes committed" -ForegroundColor Green

# Step 5: Push branch
Write-Host "`n5. Pushing branch to GitHub..." -ForegroundColor Yellow
git push -u origin add-buggy-features
if ($LASTEXITCODE -eq 0) {
    Write-Host "   ✓ Branch pushed successfully!" -ForegroundColor Green
    Write-Host "`n=== Next Steps ===" -ForegroundColor Cyan
    Write-Host "1. Go to: https://github.com/abhijeet1771/AI-reviewer" -ForegroundColor White
    Write-Host "2. Click 'Compare & pull request'" -ForegroundColor White
    Write-Host "3. Create PR" -ForegroundColor White
    Write-Host "4. Note the PR number" -ForegroundColor White
    Write-Host "5. Run: cd 'D:\DROOG AI' ; npx tsx src/index.ts --repo abhijeet1771/AI-reviewer --pr [PR_NUMBER]" -ForegroundColor White
} else {
    Write-Host "   ✗ Push failed. Check authentication." -ForegroundColor Red
    Write-Host "   Try: git push -u origin add-buggy-features" -ForegroundColor Yellow
}

