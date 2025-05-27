// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Edge
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This class manages the best [Path]s found for each edge and provides according [EdgeInfo]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearchResult].
 * @param [configuration] the configuration used for the path search
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-constructor-PathSearchResult">Online Documentation</a>
 */
external open class PathSearchResult  ( configuration: PathSearchConfiguration ) : YObject {

/**
 * Returns an [EdgeInfo] for the given edge.
 * @param [edge] the edge for which the [EdgeInfo] will be returned
 * @return an [EdgeInfo] describing the path of the edge
 * @see [setPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-getEdgeInfo">Online Documentation</a>
 */
 open   fun getEdgeInfo( edge: Edge ):EdgeInfo
/**
 * Returns the previously registered path found for the edge.
 * @param [edge] the edge for which the path is provided
 * @return the previously registered path found for the edge or `null` if no path has been registered, yet
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-getPath">Online Documentation</a>
 */
 open   fun getPath( edge: Edge ):Path
/**
 * Specifies a found path for an edge.
 * @param [edge] the edge for which the path is set
 * @param [path] the found path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchResult%23PathSearchResult-method-setPath">Online Documentation</a>
 */
 open   fun setPath( edge: Edge ,
 path: Path )

companion object : ClassMetadata<PathSearchResult> {
}
}
