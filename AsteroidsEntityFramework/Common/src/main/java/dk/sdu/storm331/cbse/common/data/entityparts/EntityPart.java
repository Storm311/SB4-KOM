/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.sdu.storm331.cbse.common.data.entityparts;

import dk.sdu.storm331.cbse.common.data.Entity;
import dk.sdu.storm331.cbse.common.data.GameData;

/**
 *
 * @author Alexander
 */
public interface EntityPart {
    void process(GameData gameData, Entity entity);
}