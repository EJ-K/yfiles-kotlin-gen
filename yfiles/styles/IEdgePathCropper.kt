// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.GeneralPath
import yfiles.graph.IEdge
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface used by the framework mainly for calculating the visible path of an edge.
 * @see [DefaultEdgePathCropper]
 * @see [EdgeStyleBase.cropPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePathCropper">Online Documentation</a>
 */
external interface IEdgePathCropper : YObject {
/**
 * Crops the provided `path` at one end of an edge.
 * @param [edge] The edge whose path is to be cropped.
 * @param [atSource] Whether to crop the source or target side of the path.
 * @param [arrow] The arrow that is used at the end of the edge.
 * @param [path] The path to crop.
 * @return The cropped path. This is can be either the same instance of the given path or a newly created instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePathCropper%23IEdgePathCropper-method-cropEdgePath">Online Documentation</a>
 */
   fun cropEdgePath( edge: IEdge ,
 atSource: Boolean ,
 arrow: IArrow? ,
 path: GeneralPath ):GeneralPath

companion object : InterfaceMetadata<IEdgePathCropper> {
/**
 * This singleton implements the same cropping behavior as [DefaultEdgePathCropper] and is immutable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePathCropper%23INSTANCE">Online Documentation</a>
 */
 val INSTANCE: IEdgePathCropper
/**
 * Creates an implementation of the interface [IEdgePathCropper] by using the given function as implementation for its [cropEdgePath] method.
 * @param [cropEdgePath] A function for [IEdgePathCropper]'s single abstract method [cropEdgePath].
 * @return An instance of the [IEdgePathCropper] interface based on the given function.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IEdgePathCropper%23IEdgePathCropper-method-create">Online Documentation</a>
 */
            @JsName("create")
            operator fun  invoke(
                cropEdgePath: (
            edge: IEdge,
atSource: Boolean,
arrow: IArrow?,
path: GeneralPath
            ) -> GeneralPath 
            ):IEdgePathCropper
}
}
