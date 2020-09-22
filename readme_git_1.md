README_Git
Git Commands and Descriptions
git –version
 
Creating a git repository
To create a directory
mkdir readme_git
To Change the directory
cd readme_git
Git Commands
Converts a directory into a local git repository.
 git init
To add a single or muiltiple files to staging area
vi firstfile
git add firstfile
To commit the changes in the local repository
git commit -m "initial commit"
To list the status of the files in staging area
git status
To configure the global username and email id
git config --global user.name = "surya1150"
 git config --global user.email - kotha.surya1150@gmail.com
Connect and add Remote Repository
To connect a local repository to a specific remote repository
git remote add origin https://github.com/surya1150/devopsbootcamp.git
Output:
 
To Clone a remote git repository into a local git repository
git clone https://github.com/surya1150/devopsbootcamp.git
To Pull the changes from master branch of the remote git repository
  cd devopsbootcamp/
  git pull origin master
Branching
To List all the branches
git branch
To create a new branch
git branch feature/test1
git checkout feature/test1
Output:
 
To delete an existing branch
git branch -d feature/test1
Output:

 


To merge a child branch to master
git checkout master
git merge feature/test1
git push origin master

Output:
 
Advance git commands

To save the changes, when they are not in state of commit
git stash
To List the stashes created
git stash list
To get the stashed work back.
git stash apply
git status
Output:
 
To get the context and history of logs of a repository
git log
To revert back to the previous version of the file.
git revert 90ec9f498137a
output:
 


