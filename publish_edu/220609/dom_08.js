window.addEventListener("load",
    function(){
        let section = document.querySelector("#section1");
        let delBtn = section.querySelector('.del-button');
        let swapBtn = section.querySelector('.swap-button');
        let tbNode = section.querySelector('tbody');
        let allcheck = section.querySelector('.overall-checkbox');

        allcheck.onclick = function(){
            let inputs = tbNode.querySelectorAll("input[type='checkbox']");
            console.log(inputs);
            for (let i=0; i<inputs.length; i++){
                inputs[i].checked = allcheck.checked;
            }
        }

        delBtn.onclick = function(){
            let inputs = tbNode.querySelectorAll("input[type='checkbox']:checked");
                // 체크된 항목만 inputs에 포함됨
            for (let i=0; i<inputs.length; i++){
                inputs[i].parentElement.parentElement.remove();
                    // input -> td -> tr
            }
        }
        swapBtn.onclick = function(){
            let inputs = tbNode.querySelectorAll("input[type='checkbox']:checked");
                // 체크된 항목만 inputs에 포함됨
            if(inputs.length != 2) alert("2개만 체크하시오.");
            trs = [];
            for (let i=0; i<inputs.length; i++){
                trs.push(inputs[i].parentElement.parentElement);
            }
            let cloneNode = trs[1].cloneNode(true);
                // 두번째 항목을 복제
            trs[0].replaceWith(cloneNode);
                // 첫번째 항목을 복제된 항목으로 대체
            trs[1].replaceWith(trs[0]);
                // 두번째 항목을 첫번째 항목으로 대체
        }
    }
);