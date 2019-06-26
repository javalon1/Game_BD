package pl.com.sda.javalon1.utils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

    class UtilsTest {
        @Test
        public void getSimpleStringLength() {
            // given
            String input = "Hello!";
            int expectedLength = 6;
            // when
            assertStringLength(input, 6);
        }

        @Test
        public void getEmptyStringLength() {
            // given
            String input = "";
            int expectedLength = 0;
            // when
            assertStringLength(input, expectedLength);
        }

        private void assertStringLength(String input, int expectedLength) {
            int length = Utils.getStringLength(input);
            // then
            assertEquals(expectedLength, length);
        }

        @Test
        public void getNullStringLength() {
            // given
            String input = null;
            int expectedLength = 0;
            // when
            assertStringLength(input, expectedLength);
        }

        @Test
        public void getNumberCount()
        {
            String input = "236";
            char searchNumber = '2';
            int expectedCount = 1;

            getNumberCountMethod(input, searchNumber, expectedCount);
        }

        private void getNumberCountMethod(String input, char searchNumber, int expectedCount) {
            int count = Utils.getNumberCount(input, searchNumber);

            assertEquals(expectedCount,count);
        }

        public void getNumberOfDigitsBiggerThan9AndThrowIt(){
            //given
            String input = "324235";
            int searchNumber =10;

            //when then

            assertThrows(NumberNotSupported.class, new Executable() {
                @Override
                public void execute() throws Throwable {
                    Utils.getNumberCount(input, searchNumber);
                }
            });
        }

        public void getNumberOfDigitsLessThan9AndThrowIt(){
            //given
            String input = "324235";
            int searchNumber =10;

            //when then

            assertThrows(NumberNotSupported.class, new Executable() {
                @Override
                public void execute() throws Throwable {
                    Utils.getNumberCount(input, searchNumber);
                }
            });
        }

    }
