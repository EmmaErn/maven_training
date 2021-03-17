package fr.lernejo;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "ADD, 18, 20, 38",
        "ADD, -20, 9, -11",
        "MULT, 5, 3, 15",
        "MULT, -8, 4, -32",
    })
    void add_multi_behave_as_expected(Sample.Operation test_nature, int a, int b, int expectedResult) {
        // When
        int result = new Sample().op(test_nature, a, b);

        // Then
        assertThat(result).isEqualTo(expectedResult);
    }
}

}
