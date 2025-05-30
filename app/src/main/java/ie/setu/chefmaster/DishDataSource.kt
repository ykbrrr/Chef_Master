package ie.setu.chefmaster

object DishDataSource {
    val dishes = listOf(
        Dish(
            id = 1,
            name = "辣椒炒肉",
            imageResId = R.drawable.lajiaochaorou, // 确保在res/drawable中有对应图片
            ingredients = listOf(
                "猪肉 300克",
                "青椒 5个",
                "大蒜 3瓣",
                "生抽 2勺",
                "老抽 1勺",
                "料酒 1勺"
            ),
            steps = listOf(
                "猪肉切片，用料酒、生抽腌制10分钟",
                "青椒切丝，大蒜切片",
                "热锅凉油，下肉片翻炒至变色",
                "加入蒜片爆香",
                "放入青椒翻炒至断生",
                "加入老抽调味，翻炒均匀出锅"
            ),
            cookingTime = "15分钟",
            difficulty = "中等"
        ),
        Dish(
            id = 2,
            name = "番茄炒蛋",
            imageResId = R.drawable.fanqiechaodan,
            ingredients = listOf(
                "番茄 2个",
                "鸡蛋 3个",
                "盐 适量",
                "糖 少许",
                "葱花 少许"
            ),
            steps = listOf(
                "番茄切块，鸡蛋打散",
                "热锅凉油，先炒鸡蛋至凝固盛出",
                "重新热油，下番茄翻炒",
                "番茄炒软后加入炒好的鸡蛋",
                "加盐、糖调味，撒葱花出锅"
            ),
            cookingTime = "10分钟",
            difficulty = "简单"
        )
        // 可以继续添加更多菜品
    )
}