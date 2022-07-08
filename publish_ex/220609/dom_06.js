window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let noticeLst = section.querySelector('.notice-list');
        let cloneBtn = section.querySelector('.clone-button');
        let inputBtn = section.querySelector('.input-button');
        let tempBtn = section.querySelector('.templit-button');

        inputBtn.onclick = function(){
            new_id = prompt("번호를 입력하시오.");
            new_name = prompt("이름을 입력하시오.");
            new_age = prompt("나이를 입력하시오.");
            new_bday = prompt("생일을 입력하시오.");
            let notices = [{번호:new_id, 이름:new_name, 나이:new_age, 생일:new_bday}]
            let tbodyNode = noticeLst.querySelector("tbody");
            let trNode = noticeLst.querySelector("tbody tr");
            let cloneNode = trNode.cloneNode(true);
            let tds = cloneNode.querySelectorAll("td");
            tds[0].textContent = notices[0].번호;
            tds[1].textContent = notices[0].이름;
            tds[2].textContent = notices[0].나이;
            tds[3].textContent = notices[0].생일;
            tbodyNode.appendChild(cloneNode);
        }

        cloneBtn.onclick = function(){
            rownum = eval(prompt("복사할 행의 번호를 입력하시오."));
            let tbodyNode = noticeLst.querySelector("tbody");
            let trNode = noticeLst.querySelectorAll('tbody tr');
                // querySelector : 맨 처음 태그 1개만 반환
                // querySelectorAll : 모든 태그를 배열로 반환
            let cloneNode = trNode[rownum-1].cloneNode(true);
                // true : tr 하위까지 포함하여 복제
                // false : tr 본인만 복제
            tbodyNode.appendChild(cloneNode);
                // tbody 하위에 복제된 노드를 연결
        }
        tempBtn.onclick = function(){
            new_id = prompt("번호를 입력하시오.");
            new_name = prompt("이름을 입력하시오.");
            new_age = prompt("나이를 입력하시오.");
            new_bday = prompt("생일을 입력하시오.");
            let notices = [{번호:new_id, 이름:new_name, 나이:new_age, 생일:new_bday}]
            let tbodyNode = noticeLst.querySelector("tbody");
            let tempNode = section.querySelector("template");
            let cloneNode = document.importNode(tempNode.content, true);
                // true : 하위 노드 전체를 불러옴
            let tds = cloneNode.querySelectorAll("td");
            tds[0].textContent = notices[0].번호;
            tds[1].textContent = notices[0].이름;
            tds[2].textContent = notices[0].나이;
            tds[3].textContent = notices[0].생일;
            tbodyNode.appendChild(cloneNode);
        }
    }
);