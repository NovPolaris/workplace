### 安装
	类似于qq的下一步 下一步
	git --version

### 初始化
	git config --global user:name "foo"
	git config --global user:email bar@email.com
	git config --list

### 区域
	工作区
	暂存区
	版本库

### 对象
	Git对象
		key:value 组成的键值对(key是value对应的hash)
				  键值对在git内部的
	树对象
	提交对象

### 分支
	分支的本质其实就是一个提交对象
	HEAD
		是一个指针 它默认指向master分支 切换分支时其实就是让HEAD指向不同的分支
		每次有新的提交时 HEAD都会带着当前指向的分支一起往前移动