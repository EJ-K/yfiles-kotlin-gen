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
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * This port label model can be used to specify any position and orientation of a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel">Online Documentation</a>
 */
external open class FreePortLabelModel 
protected constructor () : ILabelModel, ILabelModelParameterFinder {

/**
 * Creates a parameter that is anchored at the center of the port and has no rotation.
 * @return A parameter that is anchored at the center of the port and has no rotation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-createDefaultParameter">Online Documentation</a>
 */
 final override   fun createDefaultParameter():ILabelModelParameter
/**
 * Creates a parameter instance that anchors the label to the port at a given position.
 * @param [locationOffset] The offset to apply to the port's location.
 * @param [labelRatio] The ratio that describes the point on the label's layout relative to its size.
 * @param [labelOffset] The offset to apply to the point on the label after the ratio has been determined. This defaults to (0,0), representing no further offset.
 * @param [angle] The angle by which the label should be rotated around the point described using the ratio and offset, measured in radians. The default is 0.
 * @return A parameter that exactly fits the described location.
 * @throws ArgumentError `locationOffset`, `labelRatio` or `labelOffset` contains one or more `NaN` values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-createParameter">Online Documentation</a>
 */
 final   fun createParameter( locationOffset: Point ,
 labelRatio: Point ,
 labelOffset: Point?  = definedExternally,
 angle: Double  = definedExternally):ILabelModelParameter
/**
 * Tries to find a parameter that best matches the given layout for the provided label instance.
 * @param [label] The label to find a parameter for.
 * @param [model] The model instance to use. This should be this instance.
 * @param [layout] The anticipated layout for the label.
 * @return A non-`null` parameter that can be used for the label to approximate the provided layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-findBestParameter">Online Documentation</a>
 */
 final override   fun findBestParameter( label: ILabel ,
 model: ILabelModel ,
 layout: IOrientedRectangle ):ILabelModelParameter
/**
 * Returns an empty context.
 * @param [label] The label to use in the context.
 * @param [layoutParameter] The parameter to use for the label in the context.
 * @return An empty context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-getContext">Online Documentation</a>
 */
 override   fun getContext( label: ILabel ,
 layoutParameter: ILabelModelParameter ):ILookup
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-getGeometry">Online Documentation</a>
 */
 final override   fun getGeometry( label: ILabel ,
 layoutParameter: ILabelModelParameter ):IOrientedRectangle
/**
 * Returns this instance if an instance of [ILabelModelParameterFinder] is requested and `null` otherwise.
 * @param [type] The type for which an instance is requested.
 * @return An instance that is assignable to the given type or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23FreePortLabelModel-method-lookup">Online Documentation</a>
 */
 override   fun <T : YObject>lookup( type: YClass<T> ):T?

companion object : ClassMetadata<FreePortLabelModel> {
/**
 * A shared public instance that can be used to obtain parameters.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FreePortLabelModel%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: FreePortLabelModel
}
}
