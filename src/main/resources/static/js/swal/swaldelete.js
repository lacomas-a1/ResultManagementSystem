$(document).ready(function () {
  $(".delete").click(function () {
    $(document).ready(function () {
      $(document).on("click", ".delete", function () {
        var id = $(this).data("id");
        swal
          .fire({
            title: "Are you sure?",
            text: "You won't be able to revert this!",
            icon: "warning",
            showCancelButton: true,
            confirmButtonColor: "#3085d6",
            cancelButtonColor: "#d33",
            confirmButtonText: "Yes, delete it!",
          })
          .then((result) => {
            if (result.value) {
              $.ajax({
                url: "delete_data.php",
                type: "POST",
                data: { id: id },
                dataType: "json",
              })
                .done(function (response) {
                  Swal.fire(
                    "Deleted!",
                    "Your file has been deleted.",
                    "success"
                  );
                  // swal.fire('Deleted!', response.message, response.status, "success");
                })
                .fail(function () {
                  swal.fire(
                    "Oops...",
                    "Something went wrong !!!!",
                    "error"
                  );
                });
            }
          });
      });
    });
  });
});
