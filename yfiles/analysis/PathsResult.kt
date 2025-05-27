// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents all paths between two sets of nodes as computed by [paths].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathsResult">Online Documentation</a>
 */
external  class PathsResult 
private constructor () : YObject {

/**
 * Gets a collection of all paths between the [Paths.startNodes] and [Paths.endNodes].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathsResult%23paths">Online Documentation</a>
 */
final val paths: ResultItemCollection<Path>
/**
 * Gets a collection of all paths between the given `start` and `end` node.
 * @param [start] The start node to get the paths for.
 * @param [end] The end node to get the paths for.
 * @return All paths between `start` and `end`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathsResult%23PathsResult-method-getAllPathsBetween">Online Documentation</a>
 */
 final   fun getAllPathsBetween( start: INode ,
 end: INode ):ResultItemCollection<Path>
/**
 * Returns a path between the given `start` and `end` node if one exists.
 * @param [start] The start node to get the path for.
 * @param [end] The end node to get the path for.
 * @return A path between `start` and `end` or `null` if no path exists between the two nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathsResult%23PathsResult-method-getPathBetween">Online Documentation</a>
 */
 final   fun getPathBetween( start: INode ,
 end: INode ):Path?
/**
 * Determines whether a path between `start` and `end` exists.
 * @param [start] The start node.
 * @param [end] The end node.
 * @return `true` if a path exists between `start` and `end`, `false` if not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathsResult%23PathsResult-method-hasPathBetween">Online Documentation</a>
 */
 final   fun hasPathBetween( start: INode ,
 end: INode ):Boolean

companion object : ClassMetadata<PathsResult> {
}
}
