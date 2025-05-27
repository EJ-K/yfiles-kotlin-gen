// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.labeling

import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.algorithms.YList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.IEdgeLabelLayout
import yfiles.layout.INodeLabelLayout
import yfiles.layout.IProfitModel
import yfiles.layout.LabelCandidate
import yfiles.layout.LayoutGraph
import yfiles.layout.LayoutStageBase

/**
 * An abstract base class for generic labeling algorithms which place labels of graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase">Online Documentation</a>
 * 
 * @constructor Creates a new [LabelingBase] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LabelingBase-constructor-LabelingBase">Online Documentation</a>
 */
external abstract class LabelingBase  () : LayoutStageBase {

/**
 * Gets or sets the [IDataProvider][yfiles.algorithms.IDataProvider] key to mark labels as selected for placement.
 * 
 * Default value - `null`. All labels are considered to be selected.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23affectedLabelsDpKey">Online Documentation</a>
 */
open var affectedLabelsDpKey: ILabelLayoutDpKey<Boolean>?
/**
 * Gets or sets whether or not edge labels are automatically flipped if otherwise they would be upside-down.
 * 
 * Default value - `false`. Edge labels being upside-down keep their orientation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23autoFlipping">Online Documentation</a>
 */
open var autoFlipping: Boolean
/**
 * Gets or sets whether or not edge labels may overlap with edges belonging to the same edge group as the label's edge.
 * 
 * Default value - `false`. Edge labels are not allowed to overlap with edges of the same edge group.
 * @see [PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.SOURCE_GROUP_ID_DP_KEY]
 * @see [PortConstraintKeys.TARGET_GROUP_ID_DP_KEY][yfiles.layout.PortConstraintKeys.TARGET_GROUP_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23edgeGroupOverlapAllowed">Online Documentation</a>
 */
open var edgeGroupOverlapAllowed: Boolean
/**
 * Gets or sets whether or not *internal* node labels are allowed to move.
 * 
 * Default value - `false`. Internal node labels will not be moved.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23moveInternalNodeLabels">Online Documentation</a>
 */
open var moveInternalNodeLabels: Boolean
/**
 * Gets or sets whether or not labels assigned to edges are placed.
 * 
 * Default value - `true`. Edge labels will be placed.
 * @see [affectedLabelsDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23placeEdgeLabels">Online Documentation</a>
 */
open var placeEdgeLabels: Boolean
/**
 * Gets or sets whether or not labels assigned to nodes are placed.
 * 
 * Default value - `true`. Node labels will be placed.
 * @see [affectedLabelsDpKey]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23placeNodeLabels">Online Documentation</a>
 */
open var placeNodeLabels: Boolean
/**
 * Gets or sets the [IProfitModel] for ranking the [LabelCandidate]s for labels.
 * 
 * Default value - [SimpleProfitModel][yfiles.layout.SimpleProfitModel]
 * @see [IProfitModel]
 * @see [SimpleProfitModel][yfiles.layout.SimpleProfitModel]
 * @see [getProfit]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23profitModel">Online Documentation</a>
 */
open var profitModel: IProfitModel?
/**
 * Gets or sets whether or not a post-processing step to further reduce the number of label overlaps is applied.
 * 
 * Default value - `false`. Post-processing to reduce overlaps is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23reduceLabelOverlaps">Online Documentation</a>
 */
open var reduceLabelOverlaps: Boolean
/**
 * Gets or sets whether or not [label candidates][LabelCandidate] that overlap with edges are removed.
 * 
 * Default value - `false`. Candidates overlapping with edges are allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23removeEdgeOverlaps">Online Documentation</a>
 */
open var removeEdgeOverlaps: Boolean
/**
 * Gets or sets whether or not [label candidates][LabelCandidate] that overlap with nodes are removed.
 * 
 * Default value - `false`. Candidates overlapping with nodes are allowed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23removeNodeOverlaps">Online Documentation</a>
 */
open var removeNodeOverlaps: Boolean
/**
 * Places the labels in the graph after first executing the [core layouter][LayoutStageBase.coreLayout].
 * @param [graph] the input graph
 * @see [label]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LabelingBase-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )
/**
 * Returns the profit for placing a [LabelCandidate] with respect to the current [profit model][profitModel].
 * @param [candidate] a label candidate
 * @return the profit value between `0` and `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LabelingBase-method-getProfit">Online Documentation</a>
 */
 open   fun getProfit( candidate: LabelCandidate ):Double
/**
 * Places the labels of the input graph using a [IDataProvider][yfiles.algorithms.IDataProvider] registered to the input graph with the given key for determining which labels to place.
 * @param [graph] The input graph.
 * @param [key] The optional [IDataProvider][yfiles.algorithms.IDataProvider] key for label selection. If not specified, the current [selection key][affectedLabelsDpKey] is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LabelingBase-method-label(LayoutGraph,Object)">Online Documentation</a>
 */
 open   fun label( graph: LayoutGraph ,
 key: ILabelLayoutDpKey<Boolean>  = definedExternally)
/**
 * Places the labels of the input graph restricting the placement to labels contained in the given lists.
 * @param [graph] the input graph
 * @param [nodeLabels] a list of [INodeLabelLayout]s defining the set of node labels that will be placed
 * @param [edgeLabels] a list of [IEdgeLabelLayout]s defining the set of edge labels that will be placed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LabelingBase-method-label(LayoutGraph,YList,YList)">Online Documentation</a>
 */
 open   fun label( graph: LayoutGraph ,
 nodeLabels: YList<INodeLabelLayout> ,
 edgeLabels: YList<IEdgeLabelLayout> )

companion object : ClassMetadata<LabelingBase> {
/**
 * A data provider key for mapping models to edge/node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelingBase%23LABEL_MODEL_DP_KEY">Online Documentation</a>
 */
 val LABEL_MODEL_DP_KEY: ILabelLayoutDpKey<YObject>
}
}
