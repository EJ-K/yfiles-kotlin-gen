// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.GroupingSupport
import yfiles.layout.LayoutGraph

/**
 * This class contains the basic configuration used by path search algorithms.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearchConfiguration] used for a path search.
 * @param [graph] the graph containing the edges whose path will be searched
 * @param [grouping] the grouping information of the graph
 * @param [edgeRouter] the edge routing algorithm using this configuration
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23PathSearchConfiguration-constructor-PathSearchConfiguration">Online Documentation</a>
 * 
 * @property graph
 * Gets the graph containing the edges whose path is searched.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23graph">Online Documentation</a>
 * 
 * @property grouping
 * Gets the grouping information of the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23grouping">Online Documentation</a>
 * 
 * @property edgeRouter
 * Gets the edge routing algorithm using this configuration.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23edgeRouter">Online Documentation</a>
 */
external open class PathSearchConfiguration  (
open val graph: LayoutGraph,
open val grouping: GroupingSupport,
open val edgeRouter: EdgeRouter) : YObject {

/**
 * Gets the remaining time (in milliseconds) within which the algorithm should complete its calculation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchConfiguration%23remainingTime">Online Documentation</a>
 */
open val remainingTime: Int

companion object : ClassMetadata<PathSearchConfiguration> {
}
}
