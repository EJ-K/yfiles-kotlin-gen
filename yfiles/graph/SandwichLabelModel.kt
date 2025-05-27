// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.geometry.IOrientedRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A node label model that places the label either above or below the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SandwichLabelModel] class with zero offset.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-constructor-SandwichLabelModel">Online Documentation</a>
 */
external open class SandwichLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets the distance between the node's [INode.layout] and the label's [layout][ILabel.layout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23yOffset">Online Documentation</a>
 */
open var yOffset: Double
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter for the north side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-createNorthParameter">Online Documentation</a>
 */
 open   fun createNorthParameter():ILabelModelParameter
/**
 * Creates a parameter for the south side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-createSouthParameter">Online Documentation</a>
 */
 open   fun createSouthParameter():ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-getParameters">Online Documentation</a>
 */
 final override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SandwichLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<SandwichLabelModel> {
/**
 * A predefined parameter instance that places the label above the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23NORTH">Online Documentation</a>
 */
 val NORTH: ILabelModelParameter
/**
 * A predefined parameter instance that places the label below the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SandwichLabelModel%23SOUTH">Online Documentation</a>
 */
 val SOUTH: ILabelModelParameter
}
}

inline fun SandwichLabelModel(
    block: SandwichLabelModel.() -> Unit
): SandwichLabelModel {
    return SandwichLabelModel()
        .apply(block)
}
