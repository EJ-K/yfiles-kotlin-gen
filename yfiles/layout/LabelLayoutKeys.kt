// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.ILabelLayoutDpKey
import yfiles.algorithms.NodeDpKey

/**
 * [LabelLayoutKeys] are used for associating [IDataProvider][yfiles.algorithms.IDataProvider]s that contain label-specific information for edge and node labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutKeys">Online Documentation</a>
 */
external object LabelLayoutKeys {
/**
 * A data provider key for accessing label information of each edge in the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutKeys%23EDGE_LABEL_LAYOUT_DP_KEY">Online Documentation</a>
 */
 val EDGE_LABEL_LAYOUT_DP_KEY: EdgeDpKey<ReadonlyArray<LabelLayoutData>>
/**
 * A data provider key for marking labels that should be ignored by the layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutKeys%23IGNORED_LABELS_DP_KEY">Online Documentation</a>
 */
 val IGNORED_LABELS_DP_KEY: ILabelLayoutDpKey<Boolean>
/**
 * A data provider key for accessing label information of each node in the input graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelLayoutKeys%23NODE_LABEL_LAYOUT_DP_KEY">Online Documentation</a>
 */
 val NODE_LABEL_LAYOUT_DP_KEY: NodeDpKey<ReadonlyArray<LabelLayoutData>>
}
