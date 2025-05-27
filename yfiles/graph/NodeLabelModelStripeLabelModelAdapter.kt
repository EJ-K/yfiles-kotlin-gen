// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Allows parameters from [ILabelModel]s for nodes to be used for [IStripe]s in a [ITable].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter">Online Documentation</a>
 */
external open class NodeLabelModelStripeLabelModelAdapter 
protected constructor () : ILabelModel {

/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter that delegates to the given `parameter` of a [ILabelModel] for nodes.
 * @param [parameter] The parameter of a [ILabelModel] that supports nodes.
 * @return A parameter to position the stripe label as if the stripe were a node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-createParameter">Online Documentation</a>
 */
 final   fun createParameter( parameter: ILabelModelParameter ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23NodeLabelModelStripeLabelModelAdapter-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<NodeLabelModelStripeLabelModelAdapter> {
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeLabelModelStripeLabelModelAdapter%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: NodeLabelModelStripeLabelModelAdapter
}
}
