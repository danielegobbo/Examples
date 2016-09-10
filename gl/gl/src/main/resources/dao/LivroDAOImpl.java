package dao;

import model.Livro;
import java.util.List;

/**
 *
 * @author José Alexandre
 */
public interface LivroDao {

	public void save(Livro livro);

	public Livro getLivro(long id);

	public List<livro> list();

	public void remove(Livro livro);

	public void update(Livro livro);

}