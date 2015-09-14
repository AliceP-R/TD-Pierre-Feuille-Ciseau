package upo.rps.model;

/**
 * Created by alpottie on 14/09/2015.
 */
public final class RockPaperScissors {

    public Result play(RPSEnum p1, RPSEnum p2)
    {
        if( p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS || p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK || p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER )
            return Result.WIN;

        if( p1 == p2 )
            return Result.TIE;

        else
            return Result.LOST;
    }
}
