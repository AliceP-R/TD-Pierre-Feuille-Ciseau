package upo.rps.model;

/**
 * Created by alpottie on 14/09/2015.
 */
public final class RockPaperScissors {
    public final int nbre_mvt = 10;

    public Result play(RPSEnum p1, RPSEnum p2)
    {
        if( p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS || p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK || p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER )
            return Result.WIN;

        if( p1 == p2 )
            return Result.TIE;

        else
            return Result.LOST;
    }

    public Result play(Player p1, Player p2)
    {
        Result res;
        for(int i=0; i<nbre_mvt; i++)
        {
            res=play(p1.getNextMove(), p2.getNextMove());
            if(res == Result.WIN)
                p1.setScore(p1.getScore()+1);
            if(res == Result.TIE)
            {
                p1.setScore(p1.getScore()+1);
                p2.setScore(p2.getScore()+1);
            }
            if(res == Result.LOST)
            {
                p2.setScore(p2.getScore()+1);
            }
        }

        if(p1.getScore() > p2.getScore())
            return Result.WIN;
        if(p1.getScore() == p2.getScore())
            return Result.TIE;
        else
            return Result.LOST;
    }
}
