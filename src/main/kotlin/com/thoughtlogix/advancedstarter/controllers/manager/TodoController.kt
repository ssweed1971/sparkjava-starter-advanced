/*
 * MIT License
 *
 * Copyright (c) $date.year Thought Logix
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.thoughtlogix.advancedstarter.controllers

import com.infoquant.gf.server.controllers.manager.ManagerController
import com.thoughtlogix.advancedstarter.Lang
import com.thoughtlogix.advancedstarter.db.JPA
import com.thoughtlogix.advancedstarter.db.PageParams
import com.thoughtlogix.advancedstarter.db.PagedData
import com.thoughtlogix.advancedstarter.models.tools.Todo
import com.thoughtlogix.advancedstarter.models.users.User
import com.thoughtlogix.advancedstarter.services.db.TodoDbService
import com.thoughtlogix.advancedstarter.services.db.UserDbService
import org.slf4j.LoggerFactory
import spark.Spark.get

class TodoController(jpa: JPA) : ManagerController<Todo>(Todo::class.java, jpa) {

    init {
        service = TodoDbService(jpa)
        basePath = "/todo"
        objName = "todo"
        className = "Todo"
        singularName = Lang.tr("todo")
        pluralName = Lang.tr("todo")

        initCommonFilters(basePath, "user")
        initCommonRoutes()
    }
}