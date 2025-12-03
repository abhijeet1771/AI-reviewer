# How to Test AI Code Reviewer with This Project

## Step 1: Create GitHub Repository

1. Go to GitHub and create a new repository (e.g., `test-java-project`)
2. Don't initialize with README (we already have files)

## Step 2: Push This Project to GitHub

```bash
cd D:\test-java-project

# Add remote (replace YOUR_USERNAME with your GitHub username)
git remote add origin https://github.com/YOUR_USERNAME/test-java-project.git

# Push to GitHub
git branch -M main
git push -u origin main
```

## Step 3: Create a Feature Branch

```bash
# Create and switch to new branch
git checkout -b add-features

# Make some changes to test the AI reviewer
```

## Step 4: Make Changes (Example)

Edit `Calculator.java` and add some code with issues:

```java
// Add this method with issues
public int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;  // No overflow check
    }
    return result;
}
```

Or modify `UserService.java` to add more issues.

## Step 5: Commit and Push

```bash
git add .
git commit -m "Add new features with potential issues"
git push origin add-features
```

## Step 6: Create Pull Request

1. Go to your GitHub repository
2. Click "Compare & pull request"
3. Create the PR

## Step 7: Test AI Code Reviewer

From the `D:\DROOG AI` folder:

```bash
cd D:\DROOG AI

# Review the PR (replace with your repo and PR number)
npm run review -- --repo YOUR_USERNAME/test-java-project --pr 1
```

Or if using npx:
```bash
npx tsx src/index.ts --repo YOUR_USERNAME/test-java-project --pr 1
```

## Expected Issues AI Should Find

The AI reviewer should catch:
- Division by zero in `Calculator.divide()`
- No null checks in `UserService.getUser()`
- Inefficient loops
- Missing input validation
- Potential overflow issues
- Dead code

## Quick Test Without GitHub

You can also test locally by:
1. Making changes to files
2. Creating a diff manually
3. Testing the LLM integration directly




