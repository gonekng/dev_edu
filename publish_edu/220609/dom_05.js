window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let titleInput = section.querySelector('.title-input');
        let addBtn = section.querySelector('.add-button');
        let delBtn = section.querySelector('.del-button');
        let menuLst = section.querySelector('.menu-list');

        addBtn.onclick = function(){
            let textNode = document.createTextNode(titleInput.value); // text 노드 생성
            let liNode = document.createElement("li"); // li 태그 생성
            liNode.appendChild(textNode) // li 태그에 textNode 추가
            menuLst.appendChild(liNode); // menulist 아래에 li 태그 추가
            titleInput.value="";
        }
        delBtn.onclick = function(){
            let liNode = menuLst.children[0]; // 자식 중 첫번째 태그
            menuLst.removeChild(liNode); // li 태그의 부모와의 연결 제거
        }
    }
);