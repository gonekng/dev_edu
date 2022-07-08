window.addEventListener("load",
    function(){
        let section = this.document.querySelector("#section1");
        let fileBtn = section.querySelector(".file-button");
        let fileTrgBtn = section.querySelector(".file-trigger");

        fileBtn.onclick = function(e){
        };

        fileTrgBtn.onclick = function(e){
            let event = new MouseEvent("click", {
                'view' : window,
                'bubbles' : true,
                'cancelable' : true
            });
            fileBtn.dispatchEvent(event);
                //  숨겨진 fileBtn이 마우스 이벤트를 수행하도록 함
        };
        
    }
);