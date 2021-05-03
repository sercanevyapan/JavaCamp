package dorduncugunOdev3.Concrete;

import dorduncugunOdev3.Abstract.GameServices;
import dorduncugunOdev3.Entities.Game;

public class GameManager implements GameServices {

	@Override
	public void add(Game game) {
		System.out.println(game.getName()+ " isimli oyun sisteme eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " isimli oyun sisteme güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " isimli oyun sisteme silindi");
		
	}

}
