window.addEventListener("load",
    function(){
        let section = this.document.querySelector("#section1");
        let imgs = section.querySelectorAll(".img");
        let imgLst = section.querySelector("#img-list");
        let curImg = section.querySelector(".current-img");

        /* 첫번째 방법
        imgs[0].onclick = function(e){ // e : event 객체를 의미
            console.log(e.target.src);
            curImg.src = e.target.src;
        }
        imgs[1].onclick = function(e){ // e : event 객체를 의미
            console.log(e.target.src);
            curImg.src = e.target.src;
        }
        imgs[2].onclick = function(e){ // e : event 객체를 의미
            console.log(e.target.src);
            curImg.src = e.target.src;
        }
        */
        /* 두번째 방법
        for (let i=0; i<imgs.length; i++){
            imgs[i].onclick = function(e){ // e : event 객체를 의미
                console.log(e.target.src);
                curImg.src = e.target.src;
            }
        }
        */

        // 세번째 방법 :  상위 객체에서 bubbling을 통해서 관리할 수 있음
        //               단, 이미지에 해당하는 객체에만 적용해야 함
        imgLst.onclick = function(e){
            if (e.target.className == 'img')
                curImg.src = e.target.src;
        }
    }
);