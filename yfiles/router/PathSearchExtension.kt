// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Extensions are added to a [PathSearch] to influence the search process.
 * @see [PathSearch.addPathSearchExtension]
 * @see [PathSearchContext.currentEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearchExtension].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-constructor-PathSearchExtension">Online Documentation</a>
 */
external abstract class PathSearchExtension  () : YObject {

/**
 * Gets the configuration used for the path search.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23configuration">Online Documentation</a>
 */
protected open val configuration: PathSearchConfiguration
/**
 * Gets the current context of the path search.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23context">Online Documentation</a>
 */
protected open val context: PathSearchContext
/**
 * Appends additional start [entrances][CellEntrance] for the path search of the current edge to the given list of all previously generated entrances.
 * @param [allStartEntrances] a list of all previously generated entrances
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-appendStartEntrances">Online Documentation</a>
 */
 open protected   fun appendStartEntrances( allStartEntrances: IList<out CellEntrance> )
/**
 * Calculates the costs for entering the given [PartitionCell] via the given enter [OrthogonalInterval].
 * @param [currentEntrance] the entrance that was used for entering the current cell
 * @param [enteredCell] the neighboring cell that shall be entered
 * @param [enterInterval] the interval that shall be used for entering the neighboring cell
 * @param [edgeCellInfo] the information about how the current cell would be traversed if the neighboring cell would be entered by this enter interval
 * @param [maxAllowedCosts] the maximum allowed costs for this enter interval
 * @return the costs for entering the neighboring cell via the enter interval
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-calculateCosts">Online Documentation</a>
 */
 open protected   fun calculateCosts( currentEntrance: CellEntrance ,
 enteredCell: PartitionCell ,
 enterInterval: OrthogonalInterval ,
 edgeCellInfo: EdgeCellInfo ,
 maxAllowedCosts: Double ):Double
/**
 * Calculates the heuristic costs for the given [CellEntrance] that describe the minimal costs that will arise to finish the path if the given cell entrance is used as next step.
 * @param [entrance] the entrance to calculate the heuristic costs for the rest of the path
 * @return the minimal costs that will arise to finish the path if the given cell entrance is used as next step
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-calculateHeuristicCosts">Online Documentation</a>
 */
 open protected   fun calculateHeuristicCosts( entrance: CellEntrance ):Double
/**
 * Returns the cost for starting the path in the given entrance.
 * @param [startEntrance] the start entrance for which the cost is calculated
 * @return the cost for starting the path in the given entrance
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-calculateStartEntranceCost">Online Documentation</a>
 */
 open protected   fun calculateStartEntranceCost( startEntrance: CellEntrance ):Double
/**
 * Handles the cancellation of the path search for the current edge.
 * @param [context] the context containing the current edge for which the path search has been canceled
 * @see [initializeCurrentEdge]
 * @see [finalizeEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-cancelCurrentEdge">Online Documentation</a>
 */
 open protected   fun cancelCurrentEdge( context: PathSearchContext )
/**
 * Handles the cancellation of the path search for the current [PathRequest].
 * @param [context] the context containing the request for which the path search has been canceled
 * @see [initializeCurrentPathRequest]
 * @see [PathSearchContext.currentRequest]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-cancelCurrentPathRequest">Online Documentation</a>
 */
 open protected   fun cancelCurrentPathRequest( context: PathSearchContext )
/**
 * Cleans up the extension from the path searches with the current [configuration] and [context].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-cleanUp">Online Documentation</a>
 */
 open protected   fun cleanUp()
/**
 * Handles the completion of the path search for the current edge.
 * @param [context] the context containing the current edge for which the path search has been finished
 * @see [initializeCurrentEdge]
 * @see [finalizeEdges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-finalizeCurrentEdge">Online Documentation</a>
 */
 open protected   fun finalizeCurrentEdge( context: PathSearchContext )
/**
 * Handles the completion of all marked edges.
 * @param [context] the context containing the list of edges for which paths have been found
 * @see [PathSearchContext.edges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-finalizeEdges">Online Documentation</a>
 */
 open protected   fun finalizeEdges( context: PathSearchContext )
/**
 * After finding a valid target entrance and creating a [Path], the extension is notified of the found path.
 * @param [path] the path found for the current edge in the context
 * @see [PathSearchContext.currentEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-finalizePath">Online Documentation</a>
 */
 open protected   fun finalizePath( path: Path )
/**
 * Completes the path search result.
 * @param [pathSearchResult] the path search result for the edge in the current context's edge list
 * @see [initializeEdges]
 * @see [cleanUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-finalizePathSearchResult">Online Documentation</a>
 */
 open protected   fun finalizePathSearchResult( pathSearchResult: PathSearchResult )
/**
 * Initializes this extension for path searches using the given configuration.
 * @param [configuration] the configuration to use for the following path searches
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-initialize">Online Documentation</a>
 */
 open protected   fun initialize( configuration: PathSearchConfiguration )
/**
 * Initializes this extension with the current edge set in the given context.
 * @param [context] the context containing the current edge
 * @see [PathSearchContext.currentEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-initializeCurrentEdge">Online Documentation</a>
 */
 open protected   fun initializeCurrentEdge( context: PathSearchContext )
/**
 * Initializes this extension with the current [PathRequest] set in the given context.
 * @param [context] the context containing the current path request
 * @see [PathSearchContext.currentRequest]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-initializeCurrentPathRequest">Online Documentation</a>
 */
 open protected   fun initializeCurrentPathRequest( context: PathSearchContext )
/**
 * Initializes this extension with the context that contains the list of edges for which paths are calculated.
 * @param [context] the context containing the list of edges for which paths shall be found
 * @see [PathSearchContext.edges]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-initializeEdges">Online Documentation</a>
 */
 open protected   fun initializeEdges( context: PathSearchContext )
/**
 * Determines whether or not this extension considers the given [CellEntrance] as a valid target entrance, i.e., the path may end with the given entrance.
 * @param [entrance] the entrance to decide if it is a valid target entrance
 * @return `true` if the path may end with this entrance, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearchExtension%23PathSearchExtension-method-isValidTargetEntrance">Online Documentation</a>
 */
 open protected   fun isValidTargetEntrance( entrance: CellEntrance ):Boolean

companion object : ClassMetadata<PathSearchExtension> {
}
}
