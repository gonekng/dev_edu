window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let upBtn = section.querySelector('.up-button');
        let downBtn = section.querySelector('.down-button');
        let tbNode = section.querySelector('tbody');
        let curNode = tbNode.firstElementChild;

        upBtn.onclick = function(){
            let preNode = curNode.previousElementSibling;
            if (preNode == null) alert("첫 행입니다.");
            tbNode.insertBefore(curNode, preNode);
        }

        downBtn.onclick = function(){
            let nextNode = curNode.nextElementSibling;
            if (nextNode == null) alert("마지막 행입니다.");
            tbNode.insertBefore(nextNode, curNode);
                // nextNode를 curNode 앞으로 이동시킴
        }
    }
);