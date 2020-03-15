### 分支
	本地分支
	远程跟踪分支
	远程分支

### 团队协作
	1.项目经理初始化远程仓库
		一定要初始化一个空的仓库 在github上操作
	2.项目经理创建本地仓库
		git remote alias repository
		git init
		将源码复制进来
		修改用户名 修改邮箱
		git add
		git commit
	3.项目经理推送本地仓库到远程仓库
		清理windows凭据
		git push alias branchName (输入用户名和密码 推完后会附带生成远程跟踪分支)
	4.项目邀请成员 & 成员接受邀请
		在github上操作
	5.成员克隆远程仓库
		git clone repository (在本地生成 .git 文件 默认为远程仓库配了别名origin 默认主分支有对应的远程跟踪分支)
	6.成员作出贡献
		修改源码文件
		git add
		git commit
		git push 别名 分支 (输入用户名和密码)
	7.项目经理更行修改
		git fetch 别名 (将修改同步到远程跟踪分支上)
		git merge 远程跟踪分支

### 做跟踪
	克隆仓库时 会自动为master做跟踪
	本地没有分支
		git checkout --track 远程跟踪分支(remote/分支名)
	本地已经创建了分支
		git branch -u 远程跟踪分支(remote/分支名)

### 推送
	git push [alias] [branchName]

### 拉取
	git pull
	git fetch alias 合并远程跟踪分支

### pull request
	让第三方人员参与到项目中 fork