@file:Suppress("UNREACHABLE_CODE")

package com.example.a25class


val menus: MutableList<Menu> = mutableListOf()
val foods: MutableList<Menu> = mutableListOf()


fun main() {
    addData()
    displayMenu()


}

open class Menu(val name: String, val description: String) {

}

class Food(name: String, description: String, val price: Double, val category: String) :
    Menu(name, description) {

}


fun addData() {


    menus.add(Menu("1.Burgers", "앵거스 비프 통상을 다져만든 버거"))
    menus.add(Menu("2.Frozen Custard", "매장에서 신선하게 만드는 아이스크림"))
    menus.add(Menu("3.Drinks", "매장에서 직접 만드는 음료"))
    menus.add(Menu("4.Beer", "뉴욕 브르클린 브루어리에서 양조한 맥주"))
    menus.add(Menu("5.order", "주문합니다"))
    menus.add(Menu("0.cancel", "종료합니다."))


    // 버거종류 추가

    foods.add(Food("ShackBurger", "토마토,양상추,쉑소스가 토핑된 치즈버거", 6.9, "Burgers"))
    foods.add(Food("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9, "Burgers"))
    foods.add(Food("Shroom Burger", "몬스터 치즈와 체다치즈로 속을 채운 베지테리안 버거", 9.4, "Burgers"))
    foods.add(Food("cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9, "Burgers"))
    foods.add(Food("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4, "Burgers"))

    //아이스크림 종류 추가
    foods.add(Food("Plain Ice Cream", "바닐라 아이스크림", 12.1, "Frozen Custard"))
    foods.add(Food("Chocolate Ice cream", "초콜릿 아이스크림", 10.2, "Frozen Custard"))
    foods.add(Food("Fruits Ice Cream", "과일 아이스크림", 15.1, "Frozen Custard"))
    foods.add(Food("Nuts Ice Cream", "아몬드 아이스크림", 15.1, "Frozen Custard"))
    foods.add(Food("Ice Milk", "저지방 아이스크림", 9.9, "Frozen Custard"))

    // 드링크 추가

    foods.add(Food("Ade", "에이드", 7.5, "Drinks"))
    foods.add(Food("Americano", "아메리카노", 6.4, "Drinks"))
    foods.add(Food("Berverage", "음료수", 6.8, "Drinks"))
    foods.add(Food("Black Tea", "홍차", 7.7, "Drinks"))

    //술종류 추가
    foods.add(Food("Bokbunja", "복분자", 16.9, "Beer"))
    foods.add(Food("Bourbon", "버번위크키", 16.9, "Beer"))
    foods.add(Food("Cocktail", "칵테일", 16.9, "Beer"))
    foods.add(Food("Gin", "진", 26.9, "Beer"))
    foods.add(Food("Armand de Brignac", "아르망디 샴페인", 999.9, "Beer"))


}


fun displayMenu() {
    println("[SHAKESHACK MENU]")

    for (i in 0..<menus.size) {
        var menu = menus[i]
        println("${menu.name} | ${menu.description}")
    }
    val number = inputNumber()

    when (number) {
        1 -> {
            orderBurger()
        }

        2 -> {
            println("[Dirnks]")
        }

        3 -> {
            println("[Beer]")
        }

        4 -> {
            println("[Beer]")
        }

        0 -> {
            println("[종료]")
            return
        }
    }

}

fun inputNumber(): Int {
    var inputnumber = readln()!!.toInt()

    return inputnumber
}

fun showBurger() {
    println("[Burgers MENU]")
    println("[1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거]")
    println("[2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거]")
    println("[3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거]")
    println("[4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거]")
    println("[5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거]")
    println("[0. 뒤로가기      | 뒤로가기]")
}

fun orderBurger() {

    showBurger()

    var burgerorder = inputNumber()
    while (burgerorder != 0) {
        when (burgerorder) {
            1 -> {
                println("ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                showBurger()
                inputNumber()
            }

            2 -> {
                println("SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                showBurger()
                inputNumber()
            }

            3 -> {
                println("Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거")
                showBurger()
                inputNumber()
            }

            4 -> {
                println("Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                showBurger()
                inputNumber()
            }

            5 -> {
                println("Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거")
                showBurger()
                inputNumber()
            }

            0 -> {
                println("뒤로가기")
                if (burgerorder == 0) {
                    break
                }
                return displayMenu()
            }
        }
//        when (burgerorder) {
//            0->{println("뒤로가기")
//                return displayMenu()
//
//            }
//        }
//        burgerorder = inputNumber()
    }

}

class OrderType(name:Int){

}

