<template>

    <div class="container" style="margin-top:100px">
        <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
                <div class="card shadow">
                    <div class="card-body">
                        <div class="form-group">
                            <label for="user_name">이름</label>
                            <input type="text" id="user_name" v-model="userName" class="form-control" disabled="disabled"/>
                        </div>
                        <div class="form-group">
                            <label for="user_id">아이디</label>
                            <input type="text" id="user_id" v-model="userId" class="form-control" disabled="disabled"/>
                        </div>
                        <div class="form-group">
                            <label for="user_pw">비밀번호</label>
                            <input type="password" id="user_pw" v-model="userPw" class="form-control" />
                        </div>
                        <div class="form-group">
                            <label for="user_pw2">비밀번호 확인</label>
                            <input type="password" id="user_pw2" v-model="userPw2" class="form-control" />
                        </div>
                        <div class="form-group">
                            <div class="text-right">
                                <button type="button" @click="check_input" class="btn btn-primary">정보수정</button>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
            <div class="col-sm-3"></div>
        </div>
    </div>
</template>

<script>
    module.exports = {
        data: function () {
            return {
                userName   : '사용자이름',
                userId     : '사용자아이디',
                userPw     : '',
                userPw2    : '',
                checkUserId: false
            }
        },
        methods : {
            check_input : function () {
                if(this.userPw.length < 4){
                    alert("비밀번호는 4글자 이상입니다")
                    this.user_pw = ''
                    $("#user_pw").focus()
                    return
                }
                if(this.userPw2.length < 4){
                    alert("비밀번호는 4글자 이상입니다")
                    this.user_pw2 = ''
                    $("#user_pw2").focus()
                    return
                }
                if(this.userPw != this.userPw2){
                    alert("비밀번호가 일치하지 않습니다")
                    this.user_pw = ''
                    this.user_pw2 = ''
                    $("#user_pw").focus()
                    return
                }
                alert('수정되었습니다.')
                this.user_pw = ''
                this.user_pw2 = ''
            }
        }
    }
    function check_input(){

        var user_pw = $("#user_pw").val();
        var user_pw2 = $("#user_pw2").val();

        if(user_pw.length < 4){
            alert("비밀번호는 4글자 이상입니다")
            $("#user_pw").val("")
            $("#user_pw").focus()
            return false
        }
        if(user_pw2.length < 4){
            alert("비밀번호는 4글자 이상입니다")
            $("#user_pw2").val("")
            $("#user_pw2").focus()
            return false
        }
        if(user_pw != user_pw2){
            alert("비밀번호가 일치하지 않습니다")
            $("#user_pw").val("")
            $("#user_pw2").val("")
            $("#user_pw").focus()
            return false
        }

        return true
    }
</script>