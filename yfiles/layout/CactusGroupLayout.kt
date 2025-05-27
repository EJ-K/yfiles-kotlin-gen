// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.NodeDpKey
import yfiles.collections.IComparer
import yfiles.lang.ClassMetadata

/**
 * This layout algorithm arranges grouped graphs in a recursive structure.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout">Online Documentation</a>
 * 
 * @constructor Creates a new [CactusGroupLayout] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23CactusGroupLayout-constructor-CactusGroupLayout">Online Documentation</a>
 */
external open class CactusGroupLayout  () : MultiStageLayout {

/**
 * Gets or sets whether the algorithm actively prevents node label overlaps when computing the layout.
 * 
 * Default value - `true`. Node labels are considered for automatic scaling.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23considerNodeLabels">Online Documentation</a>
 */
open var considerNodeLabels: Boolean
/**
 * Gets the default policy for ordering subtree roots around their common parent.
 * @see [nodeComparer]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23defaultNodeComparer">Online Documentation</a>
 */
open val defaultNodeComparer: IComparer<Any>
/**
 * Gets the [EdgeBundling] instance that defines the settings of the edge bundling feature.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23edgeBundling">Online Documentation</a>
 */
open val edgeBundling: EdgeBundling
/**
 * Gets or sets whether or not the order of subtrees around a root may be changed by the algorithm.
 * 
 * Default value - `false`. The order given by the sketch is ignored.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23fromSketchMode">Online Documentation</a>
 */
open var fromSketchMode: Boolean
/**
 * Gets or sets the policy defining how group node sizes are determined.
 * 
 * Default value - [CactusGroupLayoutGroupSizingPolicy.ADAPTIVE]
 * @throws ArgumentError if an unknown group sizing policy is given
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23groupSizingPolicy">Online Documentation</a>
 */
open var groupSizingPolicy: CactusGroupLayoutGroupSizingPolicy
/**
 * Gets or sets whether or not the layout algorithm automatically places node labels.
 * 
 * Default value - `true`. Node labels are placed by this algorithm.
 * @see [nodeLabelingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23integratedNodeLabeling">Online Documentation</a>
 */
open var integratedNodeLabeling: Boolean
/**
 * Gets or sets a [IComparer] for children of the same parent node, by which the order of the subtrees around their parent is determined.
 * 
 * Default value - [IComparer]. Subtrees are ordered symmetrically by the number of leaves they contain.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23nodeComparer">Online Documentation</a>
 */
open var nodeComparer: IComparer<Any>
/**
 * Gets or sets the spacing used for node labels when integrated node labeling is enabled.
 * 
 * Default value - `4.0`
 * @throws ArgumentError if the given spacing value is negative
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23nodeLabelSpacing">Online Documentation</a>
 */
open var nodeLabelSpacing: Double
/**
 * Gets or sets the policy defining how node labels are placed by the integrated node labeling mechanism (for example, the desired label orientation).
 * 
 * Default value - [NodeLabelingPolicy.RAY_LIKE_LEAVES]
 * @throws ArgumentError if an unknown labeling policy is given
 * @see [integratedNodeLabeling]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23nodeLabelingPolicy">Online Documentation</a>
 */
open var nodeLabelingPolicy: NodeLabelingPolicy
/**
 * Gets or sets the maximum angle on which the root's children can be distributed around its center.
 * 
 * Default value - `180`
 * @throws ArgumentError if a negative angle, or an angle of more than `360` degrees is specified.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23preferredRootWedge">Online Documentation</a>
 */
open var preferredRootWedge: Int
/**
 * Arranges the given grouped graph in the style of a cactus group layout.
 * @param [graph] the grouped input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23CactusGroupLayout-method-applyLayoutCore">Online Documentation</a>
 */
 override   fun applyLayoutCore( graph: LayoutGraph )

companion object : ClassMetadata<CactusGroupLayout> {
/**
 * A data provider key for specifying the roots of collapsed subtrees in the hierarchy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23COLLAPSED_SUBTREE_ROOTS_DP_KEY">Online Documentation</a>
 */
 val COLLAPSED_SUBTREE_ROOTS_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying the overlap of nodes with their parent in the hierarchy.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CactusGroupLayout%23PARENT_OVERLAP_RATIO_DP_KEY">Online Documentation</a>
 */
 val PARENT_OVERLAP_RATIO_DP_KEY: NodeDpKey<Double>
}
}

inline fun CactusGroupLayout(
    block: CactusGroupLayout.() -> Unit
): CactusGroupLayout {
    return CactusGroupLayout()
        .apply(block)
}
