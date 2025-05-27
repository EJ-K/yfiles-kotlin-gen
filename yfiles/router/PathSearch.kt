// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * This is a pathfinding algorithm that calculates the shortest (i.e., the cheapest) paths for a set of edges through a [GraphPartition].
 * @see [addPathSearchExtension]
 * @see [addAdditionalEnterIntervalCalculator]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [PathSearch].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-constructor-PathSearch">Online Documentation</a>
 */
external open class PathSearch  () : YObject {

/**
 * Adds a new interval calculator to the list of registered [IEnterIntervalCalculator]s.
 * @param [enterIntervalCalculator] the calculator to add
 * @return `true` if the calculator was successfully added, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-addAdditionalEnterIntervalCalculator">Online Documentation</a>
 */
 open   fun addAdditionalEnterIntervalCalculator( enterIntervalCalculator: IEnterIntervalCalculator ):Boolean
/**
 * Adds the given extension to the list of [PathSearchExtension]s.
 * @param [extension] the extension to add to this path search
 * @return `true` if the extension has been added, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-addPathSearchExtension">Online Documentation</a>
 */
 open   fun addPathSearchExtension( extension: PathSearchExtension ):Boolean
/**
 * Calculates the costs for moving from the current [CellEntrance] to the neighboring [PartitionCell] using different enter intervals.
 * @param [currentEntrance] the current cell entrance
 * @param [enteredCell] the partition cell to enter
 * @param [enterIntervals] the different entering intervals of the entered cell
 * @param [lastEdgeCellInfos] the information about how the last cell was crossed
 * @param [context] the context information
 * @param [costs] the array in which the calculated costs for entering the neighbor cell via the according enter intervals shall be written
 * @param [maxAllowedCosts] the maximum costs an enter interval may induce. If this cost is exceeded, no further additional costs for this interval are calculated. Note that the entries in this array get modified during cost calculation
 * @see [PathSearchExtension.calculateCosts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-calculateCosts">Online Documentation</a>
 */
 open protected   fun calculateCosts( currentEntrance: CellEntrance ,
 enteredCell: PartitionCell ,
 enterIntervals: ReadonlyArray<OrthogonalInterval> ,
 lastEdgeCellInfos: ReadonlyArray<EdgeCellInfo> ,
 context: PathSearchContext ,
 costs: ReadonlyArray<Double> ,
 maxAllowedCosts: ReadonlyArray<Double> )
/**
 * Returns the estimated costs for the rest of the path when using the given [CellEntrance] for the next step in the path search.
 * @param [entrance] the current entrance
 * @param [context] the context information
 * @return the heuristic costs for the rest of the path if the given entrance is used
 * @see [PathSearchExtension.calculateHeuristicCosts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-calculateHeuristicCosts">Online Documentation</a>
 */
 open protected   fun calculateHeuristicCosts( entrance: CellEntrance ,
 context: PathSearchContext ):Double
/**
 * Resets all registered [PathSearchExtension]s and [DataProviders][yfiles.algorithms.DataProviders] added to this [PathSearch].
 * @see [PathSearchExtension.cleanUp]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-clear">Online Documentation</a>
 */
 open   fun clear()
/**
 * Decreases the given penalty settings for the current edge.
 * @param [penaltySettings] the penalty settings whose penalties shall be reduced
 * @param [decreaseFactor] the factor with values between `0` and `1` that indicates how strong to reduce the penalties
 * @param [context] the context information of the current path search
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-decreasePenaltySettings">Online Documentation</a>
 */
 open protected   fun decreasePenaltySettings( penaltySettings: PenaltySettings ,
 decreaseFactor: Double ,
 context: PathSearchContext )
/**
 * Informs all registered path search extensions about completing a path by calling their [finalizePath(Path)][PathSearchExtension.finalizePath] method.
 * @param [path] the path to finalize
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-finalizePath">Online Documentation</a>
 */
 open protected   fun finalizePath( path: Path )
/**
 * Finds paths for the edges in the given context and stores them in its [PathSearchResult][PathSearchContext.pathSearchResult].
 * @param [context] the context to use during the path search
 * @see [PathSearchContext.edges]
 * @see [PathSearchContext.pathSearchResult]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-findPaths">Online Documentation</a>
 */
 open   fun findPaths( context: PathSearchContext )
/**
 * Finds the path for the current edge in the given context.
 * @param [context] the context information needed for finding a path
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-findPathsForCurrentEdge">Online Documentation</a>
 */
 open protected   fun findPathsForCurrentEdge( context: PathSearchContext )
/**
 * Returns the path for the given edge if it has already been finalized.
 * @param [edge] the edge for which the path is returned
 * @return the finalized path for the given edge or `null` if no path has been found and finalized
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-getFinalizedPath">Online Documentation</a>
 */
 open   fun getFinalizedPath( edge: Edge ):Path
/**
 * Adds [CellEntrance]s for every interval through which the neighboring cell can be entered from the current entrance to the queue.
 * @param [currentEntrance] the current cell entrance
 * @param [neighborCell] the neighboring cell that is handled.
 * @param [context] the context information
 * @see [calculateCosts]
 * @see [calculateHeuristicCosts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-handleNeighbor">Online Documentation</a>
 */
 open protected   fun handleNeighbor( currentEntrance: CellEntrance ,
 neighborCell: PartitionCell ,
 context: PathSearchContext )
/**
 * Initializes the fields of this [PathSearch].
 * @param [configuration] the configuration that the path search shall use
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-init">Online Documentation</a>
 */
 open   fun init( configuration: PathSearchConfiguration )
/**
 * Removes the given interval calculator from the list of registered [IEnterIntervalCalculator]s.
 * @param [enterIntervalCalculator] the calculator to remove
 * @return `true` if an interval calculator was removed as a result of this call, `false` if the given calculator was not part of the list
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-removeAdditionalEnterIntervalCalculator">Online Documentation</a>
 */
 open   fun removeAdditionalEnterIntervalCalculator( enterIntervalCalculator: IEnterIntervalCalculator ):Boolean
/**
 * Removes the given extension from the list of [PathSearchExtension]s.
 * @param [extension] the extension to remove from the path search
 * @return `true` if an extension was removed as a result of this call, `false` if the given extension was not contained in the list
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathSearch%23PathSearch-method-removePathSearchExtension">Online Documentation</a>
 */
 open   fun removePathSearchExtension( extension: PathSearchExtension ):Boolean

companion object : ClassMetadata<PathSearch> {
}
}
