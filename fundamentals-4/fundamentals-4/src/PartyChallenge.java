public class PartyChallenge {

    private static final int BAD_OUTCOME = 0;
    private static final int GOOD_OUTCOME = 1;
    private static final int GREAT_OUTCOME = 2;

    public static void main(String[] args) {
        System.out.println(partyOutcome(6, 8));
        System.out.println(partyOutcome(3, 8));
        System.out.println(partyOutcome(20, 6));
        System.out.print(partyOutcome(1, 3));
    }

    private static int partyOutcome (int tea, int candy) {
        if ( tea >= 5 && candy >= 5) {
            if ((tea >= (2 * candy)) || (candy >= (2 * tea))) {
                return GREAT_OUTCOME;
            }
            return GOOD_OUTCOME;
        } else {
            return BAD_OUTCOME;
        }
    }
}
