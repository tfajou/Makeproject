package com.example.kiosk

class MainMenu {
}


fun main() {
    while (true) {
        println("======[ SHAKESHACK MENU ]======")
        println("1. Burgers")
        println("2. Frozen Custard")
        println("3. Drinks")
        println("4. Beer")
        println("0. 종료")

        print("원하는 옵션을 선택하세요: ")

        var num_option: Int? = readLine()?.trim()?.toIntOrNull()

        if (num_option == 1) {
            println("======[ Burgers MENU ]======")
            println("1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
            println("2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
            println("3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
            println("4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
            println("0. 뒤로가기      | 뒤로가기")

            print("원하는 옵션을 선택하세요: ")

            var burger_option: Int? = readLine()?.trim()?.toIntOrNull()

            if (burger_option == 1) {
                println("ShackBurger 선택")
                // 여기에 추가 작업이 필요하면 작성
            } else if (burger_option == 2) {
                println("SmokeShack 선택")
                // 여기에 추가 작업이 필요하면 작성
            } else if (burger_option == 3) {
                println("Shroom Burger 선택")
                // 여기에 추가 작업이 필요하면 작성
            } else if (burger_option == 4) {
                println("Hamburger 선택")
                // 여기에 추가 작업이 필요하면 작성
            } else if (burger_option == 0) {
                println("뒤로가기")
                // 사용자가 0을 선택해도 프로그램이 종료되지 않도록 return 제거
            } else {
                println("올바른 옵션을 선택하세요.")
            }
        } else if (num_option == 2) {
            println("Frozen Custard MENU")
        } else if (num_option == 3) {
            println("Drinks MENU")
        } else if (num_option == 4) {
            println("Beer MENU")
        } else if (num_option == 0) {
            println("종료.")
            break
            // 사용자가 0을 선택해도 프로그램이 종료되지 않도록 return 제거
        } else {
            println("올바른 옵션을 선택하세요.")
        }
    }
}

