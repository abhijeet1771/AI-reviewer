# Next Steps: Create a Pull Request

## ✅ What's Done
- ✓ Remote added: `https://github.com/abhijeet1771/test-java-project.git`
- ✓ Branch renamed to `main`
- ✓ Code ready to push

## Step 1: Push to GitHub

If the push didn't complete (authentication needed), run:

```bash
cd D:\test-java-project
git push -u origin main
```

**If you get authentication error:**
- Use GitHub Personal Access Token as password
- Or set up SSH keys
- Or use GitHub CLI: `gh auth login`

## Step 2: Create a Feature Branch

```bash
cd D:\test-java-project

# Create new branch for PR
git checkout -b add-buggy-features

# Make some changes with issues
```

## Step 3: Add Code with Issues

Edit `Calculator.java` and add this method:

```java
// Add this to Calculator.java
public int power(int base, int exponent) {
    int result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;  // No overflow check - AI should catch this
    }
    return result;
}

public String concatenate(String a, String b) {
    // Potential null pointer - AI should catch
    return a + b;
}
```

Or edit `UserService.java`:

```java
// Add to UserService.java
public void deleteUser(int index) {
    // No bounds check - AI should catch
    users.remove(index);
}
```

## Step 4: Commit and Push

```bash
git add .
git commit -m "Add new features with potential bugs"
git push origin add-buggy-features
```

## Step 5: Create Pull Request

1. Go to: https://github.com/abhijeet1771/test-java-project
2. Click "Compare & pull request" button
3. Fill in PR title and description
4. Click "Create pull request"

## Step 6: Test AI Code Reviewer

From `D:\DROOG AI` folder:

```bash
cd D:\DROOG AI

# Make sure you have .env file with your tokens
# Then run:
npm run review -- --repo abhijeet1771/test-java-project --pr 1
```

Or if npm install didn't work:
```bash
npx tsx src/index.ts --repo abhijeet1771/test-java-project --pr 1
```

## Expected Results

The AI reviewer should find:
- ✅ Division by zero issues
- ✅ Null pointer exceptions
- ✅ Missing bounds checks
- ✅ Performance issues
- ✅ Security vulnerabilities
- ✅ Code smells

Good luck testing! 🚀



