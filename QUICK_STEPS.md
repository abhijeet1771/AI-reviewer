# Quick Steps: PR Create Karo aur AI Reviewer Test Karo

## ✅ Changes Already Made
- Calculator.java mein 3 naye methods add kiye (bugs ke saath)
- UserService.java mein 3 naye methods add kiye (bugs ke saath)

## Step 1: Feature Branch Banao aur Push Karo

PowerShell mein run karo:

```powershell
cd "D:\test-java-project"

# Feature branch banao
git checkout -b add-buggy-features

# Changes add karo
git add .

# Commit karo
git commit -m "Add buggy features for AI review testing"

# Push karo
git push -u origin add-buggy-features
```

**Ya simple script run karo:**
```powershell
cd "D:\test-java-project"
.\CREATE_PR.ps1
```

## Step 2: GitHub pe PR Create Karo

1. Browser mein jao: https://github.com/abhijeet1771/AI-reviewer
2. "Compare & pull request" button dikhega (ya manually "Pull requests" → "New pull request")
3. Base: `main` ← Compare: `add-buggy-features` select karo
4. Title: "Add buggy features for AI review testing"
5. Description: "Testing AI code reviewer with intentional bugs"
6. "Create pull request" click karo
7. **PR number note karo** (e.g., #1)

## Step 3: AI Reviewer Run Karo

```powershell
cd "D:\DROOG AI"

# Direct run (build ki zarurat nahi)
npx tsx src/index.ts --repo abhijeet1771/AI-reviewer --pr 1
```

**Replace `--pr 1` with apna actual PR number**

## Expected Issues AI Should Find

### Calculator.java:
- ✅ No overflow check in `power()` method
- ✅ Potential null pointer in `concatenate()` method
- ✅ No negative number check in `factorial()` method

### UserService.java:
- ✅ No bounds check in `deleteUser()` method
- ✅ No validation in `updateUser()` method
- ✅ Inefficient loop in `getUserCount()` method

## Troubleshooting

### Push fail ho raha hai?
- GitHub token check karo
- Authentication popup mein token use karo

### PR create nahi ho raha?
- Branch push ho gaya hai?
- GitHub pe branch dikh rahi hai?

### AI reviewer error de raha hai?
- `.env` file check karo
- PR number sahi hai?
- Internet connection check karo

---

**Happy Testing! 🚀**

