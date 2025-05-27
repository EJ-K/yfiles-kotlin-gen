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
import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * A label model for node labels that lie inside of the node's [INode.layout] bounds and have been stretched to fit the node's size.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model with empty insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-constructor-InteriorStretchLabelModel">Online Documentation</a>
 */
external open class InteriorStretchLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets the insets to use within the node's [INode.layout].
 * 
 * The default is `(0,0,0,0)`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23insets">Online Documentation</a>
 */
open var insets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates the parameter for the given position.
 * @param [position] The position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-createParameter">Online Documentation</a>
 */
 open   fun createParameter( position: InteriorStretchLabelModelPosition ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * Returns the minimum size this model would require for the node owner of the label if the the given label was used with the provided parameter.
 * @param [label] The label to use.
 * @param [layoutParameter] The parameter to use.
 * @return The minimum size requirements for this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-getMinimumNodeSize">Online Documentation</a>
 */
 open   fun getMinimumNodeSize( label: ILabel ,
 layoutParameter: ILabelModelParameter ):Size
/**
 * Returns the insets this model would require for the node owner of the label if the the given label was used with the provided parameter.
 * @param [label] The label to use.
 * @param [layoutParameter] The parameter to use.
 * @return The insets rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-getNodeInsets">Online Documentation</a>
 */
 open   fun getNodeInsets( label: ILabel ,
 layoutParameter: ILabelModelParameter ):Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-getParameters">Online Documentation</a>
 */
 override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23InteriorStretchLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<InteriorStretchLabelModel> {
/**
 * A predefined parameter that places the label inside the node, filling the node's [INode.layout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23CENTER">Online Documentation</a>
 */
 val CENTER: ILabelModelParameter
/**
 * A predefined parameter that places the label at the vertical center with the preferred height of the label and the width of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23CENTER_HORIZONTAL">Online Documentation</a>
 */
 val CENTER_HORIZONTAL: ILabelModelParameter
/**
 * A predefined parameter that places the label at the horizontal center with the preferred width of the label and the height of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23CENTER_VERTICAL">Online Documentation</a>
 */
 val CENTER_VERTICAL: ILabelModelParameter
/**
 * A predefined parameter that places the label at the right side of the node interior, stretching over the node's height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23EAST">Online Documentation</a>
 */
 val EAST: ILabelModelParameter
/**
 * A predefined parameter that places the label at the top side of the node interior, stretching over the node's width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23NORTH">Online Documentation</a>
 */
 val NORTH: ILabelModelParameter
/**
 * A predefined parameter that places the label at the bottom side of the node interior, stretching over the node's width.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23SOUTH">Online Documentation</a>
 */
 val SOUTH: ILabelModelParameter
/**
 * A predefined parameter that places the label at the left side of the node interior, stretching over the node's height.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorStretchLabelModel%23WEST">Online Documentation</a>
 */
 val WEST: ILabelModelParameter
}
}

inline fun InteriorStretchLabelModel(
    block: InteriorStretchLabelModel.() -> Unit
): InteriorStretchLabelModel {
    return InteriorStretchLabelModel()
        .apply(block)
}
