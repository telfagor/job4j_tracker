package ru.job4j.tracker;

public class Jukebox {
    private static String separator = System.lineSeparator();
    public void music(int position) {
        String song;

        if (position == 1) {
            song = "Пусть бегут неуклюже" + separator
                    + "Пешеходы по лужам," + separator
                    + "А вода по асфальту рекой." + separator
                    + "И неясно прохожим" + separator
                    + "В этот день непогожий," + separator
                    + "Почему я веселый такой?" + separator
                    + separator
                    + "А я играю на гармошке" + separator
                    + "У прохожих на виду." + separator
                    + "К сожаленью, день рожденья" + separator
                    + "Только раз в году." + separator
                    + separator
                    + "Прилетит вдруг волшебник" + separator
                    + "В голубом вертолете" + separator
                    + "И бесплатно покажет кино." + separator
                    + "С днем рожденья поздравит" + separator
                    + "И, наверно, оставит" + separator
                    + "Мне в подарок пятьсот эскимо." + separator
                    + separator
                    + "А я играю на гармошке" + separator
                    + "У прохожих на виду." + separator
                    + "К сожаленью, день рожденья" + separator
                    + "Только раз в году.";
        } else if (position == 2) {
            song = "Спят усталые игрушки, книжки спят." + separator
                    + "Одеяла и подушки ждут ребят." + separator
                    + "Даже сказка спать ложится," + separator
                    + "Чтобы ночью нам присниться." + separator
                    + "Ты ей пожелай:" + separator
                    + "Баю-бай." + separator
                    +  separator
                    + "Обязательно по дому в этот час" + separator
                    + "Тихо-тихо ходит дрёма возле нас." + separator
                    + "За окошком всё темнее," + separator
                    + "Утро ночи мудренее." + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай." + separator
                    + separator
                    + "В сказке можно покататься на луне" + separator
                    + "И по радуге промчаться на коне," + separator
                    + "Со слоненком подружиться" + separator
                    + "И поймать перо Жар-птицы." + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай." + separator
                    +  separator
                    + "Баю-бай, должны все люди ночью спать." + separator
                    + "Баю-баю, завтра будет день опять." + separator
                    + "За день мы устали очень," + separator
                    + "Скажем всем: \"Спокойной ночи!\"" + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай." + separator
                    + separator
                    + "Спят усталые игрушки, книжки спят." + separator
                    + "Одеяла и подушки ждут ребят." + separator
                    + "Даже сказка спать ложится," + separator
                    + "Чтобы ночью нам присниться." + separator
                    + "Ты ей пожелай:" + separator
                    + "Баю-бай." + separator
                    + separator
                    + "Обязательно по дому в этот час" + separator
                    + "Источник teksty-pesenok.ru" + separator
                    + "Тихо-тихо ходит дрёма возле нас." + separator
                    + "За окошком всё темнее," + separator
                    + "Утро ночи мудренее." + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай." + separator
                    + separator
                    + "В сказке можно покататься на луне" + separator
                    + "И по радуге промчаться на коне," + separator
                    + "Со слоненком подружиться" + separator
                    + "И поймать перо Жар-птицы." + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай." + separator
                    + separator
                    + "Баю-бай, должны все люди ночью спать." + separator
                    + "Баю-баю, завтра будет день опять." + separator
                    + "За день мы устали очень," + separator
                    + "Скажем всем: \"Спокойной ночи!\"" + separator
                    + "Глазки закрывай," + separator
                    + "Баю-бай.";
        } else {
            song = "Песня не найдена";
        }
        System.out.println(song);
    }

    public static void main(String[] args) {
        Jukebox j = new Jukebox();
        j.music(1);
    }

}
