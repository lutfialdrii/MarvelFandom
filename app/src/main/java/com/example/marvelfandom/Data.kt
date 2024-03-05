package com.example.marvelfandom

fun getMarvelList(): ArrayList<Marvel> {
    val marvelList = ArrayList<Marvel>()

    val names = arrayOf(
        "Black Widow", "Dr. Strange", "Spiderman", "Captain America", "Thor",
        "Loki", "Iron Man", "Hulk", "Groot", "Rocket Raccoon", "Thanos", "Black Panther"
    )

    val aliases = arrayOf(
        "Natasha Romanova", "Dr. Stephen Vincent Strange", "Peter Benjamin Parker",
        "Cpt. Steven Steve Rogers", "Thor Odinson", "Loki Laufeyson",
        "Anthony Edward / Tony Stark", "Dr. Robert Bruce Banner", "Groot", "Rocket Raccoon",
        "Thanos", "T'Challa"
    )

    val images = arrayOf(
        "https://i.pinimg.com/564x/a2/f8/47/a2f847fb083e16bf0664e8da34ec2546.jpg",
        "https://i.pinimg.com/564x/2c/ca/48/2cca487d463543a7fa6c605c345e2872.jpg",
        "https://i.pinimg.com/736x/a0/58/25/a05825b8e8d41f0daf638c9ca38e6842.jpg",
        "https://i.pinimg.com/236x/32/34/14/323414aa8d7e4046b9b60003f00e396d.jpg",
        "https://i.pinimg.com/564x/4a/aa/77/4aaa7759aaaf34a7a17e688719002721.jpg",
        "https://i.pinimg.com/564x/da/ff/46/daff467b4d9b9d978d191bccce6884dd.jpg",
        "https://i.pinimg.com/564x/4a/42/e8/4a42e8ae030a7c4ae59e241052c5cf6b.jpg",
        "https://i.pinimg.com/564x/38/f3/1e/38f31e43f9c0502485927a3b86553dd7.jpg",
        "https://i.pinimg.com/564x/30/7d/d2/307dd2e912df8f4aea0ad35f2dfe2fc7.jpg",
        "https://images.squarespace-cdn.com/content/v1/5133bc80e4b0c6fb04dcd6c4/1700660187444-SL0CDW6ON55GNAD2JKS0/rocket_racoon_e27_web.jpg",
        "https://i.pinimg.com/564x/5b/ff/96/5bff96fbe4d9c963fd3cf533c503734f.jpg",
        "https://i.pinimg.com/564x/8c/4a/17/8c4a17fc8e53a5239f8bb4cd10af234f.jpg"
    )

    val descriptions = arrayOf(
        "She was trained by the Red Room as part of the Black Widow Ops Program to be the ultimate Super-Spy. ...",
        "He was involved a car crash that so injured his hands that it stripped him of his fine motor skills, ...",
        "Sometimes student, sometimes scientist and sometimes photographer, Peter Parker is a full-time ...",
        "Cpt. Steven Steve Rogers a.k.a. Captain America, the First Avenger, was rejected by the U.S. Army ...",
        "Thor is the God of Thunder, a member of the race known as the Asgardians, a group of humanoid ...",
        "Loki Laufeyson[1] is the Trickster God,[1] God of Mischief,[4] Evil,[5] and Lies[7] a member of ...",
        "Tony Stark is a genius inventor and billionaire industrialist, who suits up in his armor of ...",
        "Dr. Bruce Banner, Ph.D.[4] a.k.a. the Hulk is an American theoretical physicist, famed for his ...",
        "Groot was a Flora colossi from Planet X, the capital of the branch worlds. He did not get along ...",
        "Rocket Raccoon is a genetically and cybernetically enhanced raccoon[8][2][9] turned freelance ...",
        "Thanos was one of the last sons of A'Lars, progenitor of the second colony of Eternals on Titan, ...",
        "T'Challa a.k.a. the Black Panther[24] is the head of state for the African nation of Wakanda, ...",
    )

    val categories = arrayOf(
        "Savage Avengers (Earth-616)",
        "Savage Avengers (Earth-616)",
        "Threats and Menaces (Earth-616)",
        "Avengers (Earth-616)",
        "Heralds of Galactus (Earth-616)",
        "Cabal (Dark Illuminati) (Earth-616)",
        "Avengers (Earth-616)",
        "Cosmic Avengers (Earth-616)",
        "Guardians of the Galaxy (Earth-616)",
        "Guardians of the Galaxy (Earth-616)",
        "Masters of Evil (Multiverse)",
        "Taifa Ngao (Earth-616)"
    )

    for (i in names.indices) {
        val marvel = Marvel(names[i], aliases[i], descriptions[i], images[i], categories[i])
        marvelList.add(marvel)
    }

    return marvelList
}
