# git Command

    $ git status   //查看当前状态,告诉你有文件被修改过
    $ git diff [×.txt]    //查看区别（改动的地方）
    

    $ git add cha.txt  // git add . |增加所有
    $ git commit -m "第一次修改，改了什么" //提交至版本库,并方便回退
    

    $ git log      // 查看修改的历史记录  |--pretty=oneline 
    $ git reset --  hard HEAD^  //回退到上一版本 `HEAD^^`上上个版本 |HEAD~100 前100个版本
    //若想取消回退
    $ git reset --hard 1092a  //1092a 是版本号前几个字符，即1092adb545562
    $ git reflog     //git reflog 记录了每一次的命令
    

    $ git checkout -- cha.txt  //将cha.txt 文件在工作区的修改全部撤销
    //让这个文件回到最近一次`git commit`或`git add`时的状态。
----
场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令`git checkout -- file`。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令`git reset HEAD <file>`，就回到了场景1，第二步按场景1操作。

场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考[版本回]一节，不过前提是没有推送到远程库。











   
   



    
