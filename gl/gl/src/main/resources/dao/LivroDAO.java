package dao;

import model.Livro;
import java.util.List;

/**
 *
 * @author José Alexandre
 */
public interface LivroDao {

	public void saveLivro(Livro livro);

	public Livro getLivro(long id);

	public List<livro> listLivros();

	public void removeLivro(Livro livro);

	public void updateLivro(Livro livro);

}