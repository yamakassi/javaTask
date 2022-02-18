package task7.human;

public class TestName {


        private void testName(Human human) throws ValidateException {
            if (human.getName().length()<3 ||
                    human.getName().length()>200
            ){
                throw new ValidateException("имя не может быть меньше 3 и больше 200");}
        }

}
