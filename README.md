# Collection of solutions of tasks given by university

Good for learning/comparing some different solutions than your own. Or if you are hardstuck.

Currently these are only my own solutions, but good news!:
Anyone who happens to stumble upon this page, happens to be studying at the same university and would like to contribute to the repository in any way, shape or form can do so.


### How to contribute

On the TOP RIGHT CORNER press FORK then:

Clone the forked repo and reinit

```git clone YourForkedRepoURL```

```git init```

Add this repo as remote repository and set upstream

```git remote add forkOrigin YourForkedRepoURL``` 

```git remote add origin https://github.com/LoweloDev/University/``` 

```git branch --set-upstream origin university_protected```

Before you start adding changes to the repo at any time make sure you got the most up to date version:

```git pull origin university_protected``` or just ```git pull``` since we set upstream before.

Do whatever you want with it. 

Add the changes to the index 

```git add pathToFile``` 

or to add all files in folder to index of current branch 

```git add .```

Commit the changes 

```git commit -m "commitmessage"``` 

Push the changes to new branch

```git push origin BranchName``` 

Create pull request via the button or the pull requests tab and wait for review.
