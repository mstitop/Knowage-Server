/*
 * Knowage, Open Source Business Intelligence suite
 * Copyright (C) 2019 Engineering Ingegneria Informatica S.p.A.
 *
 * Knowage is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Knowage is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.eng.spagobi.tools.news.dao;

import java.util.List;

import it.eng.spagobi.commons.dao.ISpagoBIDao;
import it.eng.spagobi.tools.news.bo.News;
import it.eng.spagobi.tools.news.metadata.SbiNews;

public interface ISbiNewsDAO extends ISpagoBIDao {

	public List getAllNews();

	public void deleteNew(Integer newsId);

	public void createOrUpdate(SbiNews sbiNews);

	public News saveNews(News aNews);

	public News toBasicNews(SbiNews aNews);

	public News getNewsById(Integer id);

}