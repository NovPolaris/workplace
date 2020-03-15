### 切换分支
	最佳实践： 每次切换分支前 当前分支一定得是干净的(已提交的状态)
	坑：
		在切换分支时 如果当前分支上有未暂存的修改(第一次)或者 有未提交的暂存(第一次)
		分值可以切换成功 但是这种操作可能会污染其他分支
	动三个地方
		HEAD
		暂存区
		工作目录

### 撤销
	工作区
		git checkout -- fileName          如何撤回自己在工作区中的修改
	暂存区
		git reset HEAD fileName           如何撤回自己在暂存区中的修改
	版本库
		git add .
		git commit --amend                如何测回自己在版本库中的修改

### reset
	三部曲
		git reset --soft commitHash       重置HEAD(带着分支一起移动)
		git reset [--mixed] commitHash    重置HEAD(带着分支一起移动)	重置暂存区
		git reset --hard commitHash       重置HEAD(带着分支一起移动)	重置暂存区	重置工作目录
