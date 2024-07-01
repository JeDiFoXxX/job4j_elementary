package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class DummyBotTest {

    @Test
    void whenGreetBot() {
        String input = "Hi, Bot.";
        String expected = "Hi, SmartAss.";
        String outputResult = DummyBot.answer(input);
        assertThat(outputResult).isEqualTo(expected);
    }

    @Test
    void whenByeBot() {
        String input = "Bye.";
        String expected = "See you later.";
        String outputResult = DummyBot.answer(input);
        assertThat(outputResult).isEqualTo(expected);
    }

    @Test
    void whenUnknownBot() {
        String input = "Can you add two plus two?";
        String expected = "I don't know. Please, ask another question.";
        String outputResult = DummyBot.answer(input);
        assertThat(outputResult).isEqualTo(expected);
    }
}