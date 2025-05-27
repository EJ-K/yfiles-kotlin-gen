// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.algorithms.Node
import yfiles.collections.IList
import yfiles.layout.IEdgeLabelLayout
import yfiles.layout.INodeLabelLayout
import yfiles.layout.PartitionCellId

/**
 * This class defines keys to obtain additional information about a [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys">Online Documentation</a>
 */
external object PartitionCellKeys {
/**
 * The key references a [IList] of [Number] values representing factors that are multiplied by an edge's [edge label crossing costs][PenaltySettings.edgeLabelCrossingPenalty] in case the edge crosses the corresponding [edge label][IEdgeLabelLayout] registered with key [EDGE_LABEL_LAYOUTS_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23EDGE_LABEL_CROSSING_COST_FACTORS_KEY">Online Documentation</a>
 */
 val EDGE_LABEL_CROSSING_COST_FACTORS_KEY: PartitionCellKey<IList<out Double>>
/**
 * The key references a [IList] of [IEdgeLabelLayout]s covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23EDGE_LABEL_LAYOUTS_KEY">Online Documentation</a>
 */
 val EDGE_LABEL_LAYOUTS_KEY: PartitionCellKey<IList<out IEdgeLabelLayout>>
/**
 * The key references a [IList] of nodes being in node to edge distance to a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23NODES_IN_NODE_TO_EDGE_DISTANCE_KEY">Online Documentation</a>
 */
 val NODES_IN_NODE_TO_EDGE_DISTANCE_KEY: PartitionCellKey<IList<out Node>>
/**
 * The key references a [IList] of nodes whose bounds are covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23NODES_KEY">Online Documentation</a>
 */
 val NODES_KEY: PartitionCellKey<IList<out Node>>
/**
 * The key references a [IList] of [Number] values representing factors that are multiplied by an edge's [node label crossing costs][PenaltySettings.nodeLabelCrossingPenalty] in case the edge crosses the corresponding [node label][INodeLabelLayout] registered with key [NODE_LABEL_LAYOUTS_KEY].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23NODE_LABEL_CROSSING_COST_FACTORS_KEY">Online Documentation</a>
 */
 val NODE_LABEL_CROSSING_COST_FACTORS_KEY: PartitionCellKey<IList<out Double>>
/**
 * The key references a [IList] of [INodeLabelLayout]s covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23NODE_LABEL_LAYOUTS_KEY">Online Documentation</a>
 */
 val NODE_LABEL_LAYOUTS_KEY: PartitionCellKey<IList<out INodeLabelLayout>>
/**
 * The key references the [PartitionCellId] of the [PartitionGrid][yfiles.layout.PartitionGrid] cell covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23PARTITION_GRID_CELL_ID_KEY">Online Documentation</a>
 */
 val PARTITION_GRID_CELL_ID_KEY: PartitionCellKey<PartitionCellId>
/**
 * The key references the column index of the [PartitionGrid][yfiles.layout.PartitionGrid] cell covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23PARTITION_GRID_COLUMN_INDEX_KEY">Online Documentation</a>
 */
 val PARTITION_GRID_COLUMN_INDEX_KEY: PartitionCellKey<Int>
/**
 * The key references the row index of the [PartitionGrid][yfiles.layout.PartitionGrid] cell covering a certain [PartitionCell].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PartitionCellKeys%23PARTITION_GRID_ROW_INDEX_KEY">Online Documentation</a>
 */
 val PARTITION_GRID_ROW_INDEX_KEY: PartitionCellKey<Int>
}
