// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.EdgeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * [OrthogonalSegmentDistributionStage] distributes overlapping edge segments of orthogonally routed edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [OrthogonalSegmentDistributionStage] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23OrthogonalSegmentDistributionStage-constructor-OrthogonalSegmentDistributionStage">Online Documentation</a>
 */
external open class OrthogonalSegmentDistributionStage  () : LayoutStageBase {

/**
 * Gets or sets the key to register a [IDataProvider][yfiles.algorithms.IDataProvider] which determines the edges that shall be routed by this algorithm.
 * 
 * Default value - [DEFAULT_AFFECTED_EDGES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23affectedEdgesDpKey">Online Documentation</a>
 */
open var affectedEdgesDpKey: EdgeDpKey<Boolean>
/**
 * Gets or sets whether or not the grid spacing can be reduced if there is not enough space.
 * 
 * Default value - `true`. The layout algorithm is allowed to reduce the grid spacing.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23flexibleGridSpacing">Online Documentation</a>
 */
open var flexibleGridSpacing: Boolean
/**
 * Gets or sets whether or not the preferred distance between edges can be reduced if there is not enough space.
 * 
 * Default value - `true`. The preferred distance will be reduced if necessary.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23flexiblePreferredDistance">Online Documentation</a>
 */
open var flexiblePreferredDistance: Boolean
/**
 * Gets the x-coordinate of the origin of the grid.
 * @see [setGridOrigin]
 * @see [gridRouting]
 * @see [gridOriginY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23gridOriginX">Online Documentation</a>
 */
open val gridOriginX: Double
/**
 * Gets the y-coordinate of the origin of the grid.
 * @see [setGridOrigin]
 * @see [gridRouting]
 * @see [gridOriginX]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23gridOriginY">Online Documentation</a>
 */
open val gridOriginY: Double
/**
 * Gets or sets whether or not the orthogonal segments are distributed on grid coordinates.
 * 
 * Default value - `false`. Edges are distributed where there is enough space.
 * @see [setGridOrigin]
 * @see [gridSpacing]
 * @see [flexibleGridSpacing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23gridRouting">Online Documentation</a>
 */
open var gridRouting: Boolean
/**
 * Gets or sets the spacing between two grid lines.
 * 
 * Default value - `10`
 * @throws ArgumentError if the specified spacing is negative
 * @see [gridRouting]
 * @see [flexibleGridSpacing]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23gridSpacing">Online Documentation</a>
 */
open var gridSpacing: Double
/**
 * Gets or sets whether or not the first and last segment of an edge will be distributed.
 * 
 * Default value - `false`. The first and last segments will be distributed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23lockFirstAndLastSegment">Online Documentation</a>
 */
open var lockFirstAndLastSegment: Boolean
/**
 * Gets or sets the preferred distance between each two segments.
 * 
 * Default value - `10.0`
 * @throws ArgumentError if the specified distance is negative
 * @see [flexiblePreferredDistance]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23preferredDistance">Online Documentation</a>
 */
open var preferredDistance: Double
/**
 * Distributes overlapping orthogonal segments after the core layout has been calculated.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23OrthogonalSegmentDistributionStage-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Specifies the coordinates of the origin of the grid.
 * @param [offsetX] the x-coordinate of the grid origin
 * @param [offsetY] the y-coordinate of the grid origin
 * @see [gridRouting]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23OrthogonalSegmentDistributionStage-method-setGridOrigin">Online Documentation</a>
 */
 open   fun setGridOrigin( offsetX: Double ,
 offsetY: Double )

companion object : ClassMetadata<OrthogonalSegmentDistributionStage> {
/**
 * A data provider key for determining which edges are distributed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrthogonalSegmentDistributionStage%23DEFAULT_AFFECTED_EDGES_DP_KEY">Online Documentation</a>
 */
 val DEFAULT_AFFECTED_EDGES_DP_KEY: EdgeDpKey<Boolean>
}
}

inline fun OrthogonalSegmentDistributionStage(
    block: OrthogonalSegmentDistributionStage.() -> Unit
): OrthogonalSegmentDistributionStage {
    return OrthogonalSegmentDistributionStage()
        .apply(block)
}
