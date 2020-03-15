### git底层命令
	git对象
		git hash-object -w fileUrl                              生成一个key(hash值):value(压缩后的文件内容) [.git/objects]
	tree对象
		git update-index --add --cacheinfo 10064 hash fileUrl   往暂存区添加一条记录(让git对象对应上文件名) [.git/index]
		git write-tree                                          生成树对象 [.git/objects]
	commit对象
		echo '' | git commit-tree                               生成一个提交对象 [.git/objects]
	对以上对象的查询
		git cat-file -p hashValue                               拿对应对象的内容
		git cat-file -t hashValue                               拿对应对象的类型
		git ls-files -s                                         查看暂存区

### git高层命令(CRUD)
	git init                                                    初始化仓库
	git status                                                  查看文件的状态
	git diff                                                    查看哪些修改还没有暂存
	git diff --staged                                           查看哪些修改已经被暂存了还没被提交
	git log --oneline                                           查看提交的历史记录
	git log --oneline --decorate --graph --all                  查看整个项目的分支图
	git add .                                                   将修改添加到暂存区
	git rm fileName                                             删除工作目录中对应的文件 再将修改添加到暂存区
	git mv original new                                         将工作目录中的文件进行重命名 再将修改添加到暂存区
	git commit                                                  进入vim编辑器
	git commit -a
	git commit -m "msg"
	git commit -a -m "msg"                                      将暂存区提交到版本库

### git高层命令(branch)
    git branch                                                  显示分支列表
    git branch -v                                               查看分支指向的最新的提交
    git branch --merged / --no-merged                           查看合并/为合并到当前分支的分支列表
    git branch branchName                                       在当前提交对象上创建新的分支
    git branch branchName commitHash                            在指定的提交对象上创建新的分支
    git checkout branchName                                     切换分支
    git checkout -b branchName                                  创建并切换分支
    git branch -d branchName                                    删除空的分支或者已经被合并的分支
    git branch -D branchName                                    强制删除分支
    git merge branchName                                        合并分支 (快速合并，典型合并)

### Other
	git config --global alias.name command                      配别名