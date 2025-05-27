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
 * A label model for node labels that lie inside of the node's [INode.layout] bounds.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel">Online Documentation</a>
 * 
 * @constructor Creates a new instance of this model with empty insets.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-constructor-InteriorLabelModel">Online Documentation</a>
 */
external open class InteriorLabelModel  () : ILabelModel, ILabelModelParameterProvider {

/**
 * Gets or sets the insets to use within the node's [INode.layout].
 * 
 * The default is `(0,0,0,0)`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23insets">Online Documentation</a>
 */
open var insets: Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates the parameter for the given position.
 * @param [position] The position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-createParameter">Online Documentation</a>
 */
 open   fun createParameter( position: InteriorLabelModelPosition ):ILabelModelParameter
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * Returns the minimum size this model would require for the node owner of the label if the given label was used with the provided parameter.
 * @param [label] The label to use.
 * @param [layoutParameter] The parameter to use.
 * @return The minimum size requirements for this label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-getMinimumNodeSize">Online Documentation</a>
 */
 open   fun getMinimumNodeSize( label: ILabel ,
 layoutParameter: ILabelModelParameter ):Size
/**
 * Returns the insets this model would require for the node owner of the label if the given label was used with the provided parameter.
 * @param [label] The label to use.
 * @param [layoutParameter] The parameter to use.
 * @return The insets rectangle.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-getNodeInsets">Online Documentation</a>
 */
 open   fun getNodeInsets( label: ILabel ,
 layoutParameter: ILabelModelParameter ):Insets
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-getParameters">Online Documentation</a>
 */
 override   fun getParameters( label: ILabel ,
 model: ILabelModel ):IEnumerable<ILabelModelParameter>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23InteriorLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<InteriorLabelModel> {
/**
 * A predefined parameter instance that places the label at the center of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23CENTER">Online Documentation</a>
 */
 val CENTER: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the right side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23EAST">Online Documentation</a>
 */
 val EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the top.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23NORTH">Online Documentation</a>
 */
 val NORTH: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the upper right corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23NORTH_EAST">Online Documentation</a>
 */
 val NORTH_EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the upper left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23NORTH_WEST">Online Documentation</a>
 */
 val NORTH_WEST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the bottom.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23SOUTH">Online Documentation</a>
 */
 val SOUTH: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the lower right corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23SOUTH_EAST">Online Documentation</a>
 */
 val SOUTH_EAST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the lower left corner.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23SOUTH_WEST">Online Documentation</a>
 */
 val SOUTH_WEST: ILabelModelParameter
/**
 * A predefined parameter instance that places the label inside the node at the left side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/InteriorLabelModel%23WEST">Online Documentation</a>
 */
 val WEST: ILabelModelParameter
}
}

inline fun InteriorLabelModel(
    block: InteriorLabelModel.() -> Unit
): InteriorLabelModel {
    return InteriorLabelModel()
        .apply(block)
}
