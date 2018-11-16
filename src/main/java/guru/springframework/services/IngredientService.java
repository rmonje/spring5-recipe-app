package guru.springframework.services;

import guru.springframework.commands.IngredientCommand;

/**
 * Created by rbenitez on November 2018.
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(Long recipeId, Long idToDelete);
}
