// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.ILookup
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata

/**
 * Allows parameters from [ILabelModel]s for nodes to be used for [IStripe]s in a [ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter">Online Documentation</a>
 */
open external class NodeLabelModelStripeLabelModelAdapter protected constructor() : ILabelModel {
  /**
   * Creates a parameter that delegates to the given `parameter` of an [ILabelModel] for nodes.
   * @param [parameter] The parameter of an [ILabelModel] that supports nodes.
   * @return A parameter to position the stripe label as if the stripe were a node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-createParameter">Online Documentation</a>
   */
  fun createParameter(
    parameter: ILabelModelParameter,
  ): NodeLabelModelStripeLabelModelAdapterParameter
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-getContext">Online Documentation</a>
   */
  override fun getContext(
    label: ILabel,
  ): ILookup
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-getGeometry">Online Documentation</a>
   */
  final override fun getGeometry(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  ): IOrientedRectangle
  
  companion object : ClassMetadata<NodeLabelModelStripeLabelModelAdapter> {
    /**
     * A shared public instance that can be used to obtain parameters.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23INSTANCE">Online Documentation</a>
     */
     val INSTANCE: NodeLabelModelStripeLabelModelAdapter
  }
}
